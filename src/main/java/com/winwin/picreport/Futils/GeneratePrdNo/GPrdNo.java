package com.winwin.picreport.Futils.GeneratePrdNo;

import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.Edto.PrdtSamp;
import com.winwin.picreport.Futils.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class GPrdNo {
    @Autowired
    private Cnst cnst;
    /**
     *判断前端传过来的要存的prdtSamp里面的prdCode
     * 是否在表prdt中有一个name字段对应_对应就找到第一个prd_no用_
     * 不对应就到idx表找到对应的分类_然后找到idx分类的最大no,然后加一流水到prdt中插入一项
     * */


    @Transactional
    public void prdtSampObjGetPrdNo(PrdtSamp prdtSamp,String usr,String chkMan){
        //得到前端传过来的prdt_code//在prdt里面其实对应的name
        String prdCode = prdtSamp.getPrdCode();
        //在prdt表中找该prdtCode是否对应一个name字段,有可能多个,但是我们只要一个,所以,我们要自己写sql找到top 1
        String prdtNo=cnst.a001TongYongMapper.selectTop1PrdtNo(prdCode);
        if(NotEmpty.notEmpty(prdtNo)){
            //如果不是空的,我们就要把这个prdtNo放到prdtSamp里面,将来进行插入prdt_samp表用
            prdtSamp.setPrdNo(prdtNo);
        }else{
            //此时代表prdt表中没有对应的prd_no,这时候需要到idx表流水一个
            //通过prd_code(name)到表idx中找最后一个流水
            this.prdtSampObjGetPrdNoByIndxGenerate(prdtSamp,usr,chkMan);
        }

        //专门为了价格保存做的额,因为主表插入的时候会插入prd_no,但是价格保存不会动主表,动的up_def
        //为了对不保存价格的时候没有prdNo,用这里的流水,但是流完后没有加入到打样主表,prdt_samp,我们再加入一次
        prdtNo=prdtSamp.getPrdNo();
        String uuid = prdtSamp.getId();
        //放入prdt_samp
        PrdtSamp pp=new PrdtSamp();
        pp.setPrdNo(prdtNo);
        pp.setId(uuid);
        cnst.prdtSampMapper.updateByPrimaryKey(pp);

    }




    @Transactional
    public void prdtSampObjGetPrdNoByIndxGenerate(PrdtSamp prdtSamp,String usr,String chkMan){
        synchronized (this) {
            //得到中类代号
            String indx1=prdtSamp.getIdxNo();
            //在prdt里面找到相同的indx1的prdNo流水最大的那个
            String prdNoMax= cnst.a001TongYongMapper.selectTop1MaxPrdtNo(indx1);
            //将prdNoMax转化成long
            if(NotEmpty.notEmpty(prdNoMax)){
                long l = Long.parseLong(prdNoMax);
                l=l+1;
                String prdNo = String.valueOf(l);
                //给prdtSamp添加货号
                prdtSamp.setPrdNo(prdNo);
                //对应数据库的name
                String prdCode = prdtSamp.getPrdCode();
                //给prdt也添加一个货号
                cnst.a001TongYongMapper.insertPrdtOnePrdNo(prdNo,indx1,prdCode,usr,chkMan);

            }
        }

    }
}
