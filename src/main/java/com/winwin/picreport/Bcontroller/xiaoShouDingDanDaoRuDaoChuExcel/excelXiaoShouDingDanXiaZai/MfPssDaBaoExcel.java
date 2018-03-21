package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.excelXiaoShouDingDanXiaZai;



import com.winwin.picreport.AllConstant.Cnst;
import com.winwin.picreport.AllConstant.InterFaceCnst;
import com.winwin.picreport.Edto.*;
import com.winwin.picreport.Futils.MsgGenerate.Msg;
import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *导出exce前奏---打包
 * */
@CrossOrigin
@RestController
public class MfPssDaBaoExcel {

    @Autowired
    private Cnst cnst;


    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    @RequestMapping(value = InterFaceCnst.mfPssDaBao,method = RequestMethod.POST)
    public @ResponseBody
    Msg f(@RequestBody ChaXunTiaoJian chaXunTiaoJian, HttpServletResponse response){
//注册所有异常信息

        //用于记录以完成的下载的数据量，单位是byte
        long downloadedLength = 0l;
        try {
            /**
             *下面开始读取数据库数据
             * */
            List<String> cusNos = chaXunTiaoJian.getCus_no();
            String endTime = chaXunTiaoJian.getEndTime();
            String startTime=chaXunTiaoJian.getStartTime();

            if(p.empty(cusNos)){
                throw new RuntimeException("客户代号是空的"+p.knownExceptionSign);
            }
            if(p.empty(endTime)){
                throw new RuntimeException("结束时间是空的"+p.knownExceptionSign);
            }
            if(p.empty(startTime)){
                throw new RuntimeException("开始时间是空的"+p.knownExceptionSign);
            }



            //得到所有的符合条件的单号
            List<String>psNos=new LinkedList<>();
            for(String cusNo:cusNos){
                List<String>psNos1=cnst.manyTabSerch.selectMfpssOsNo(cusNo,startTime,endTime);
                psNos.addAll(psNos1);
            }

            List<Order2Excel>order2Excels=new LinkedList<>();
            for(String psNo:psNos){

                //从表头得到信息
                Map<String,String>mfps=cnst.manyTabSerch.selectMfInfo(psNo);


                TfPssExample tpe=new TfPssExample();
                tpe.createCriteria().andPsNoEqualTo(mfps.get("psNo"));
                List<TfPss> tfPsses = cnst.tfPssMapper.selectByExample(tpe);

                TfPssZExample tpze=new TfPssZExample();
                tpze.createCriteria().andPsNoEqualTo(mfps.get("psNo"));
                List<TfPssZ> tfPssZS = cnst.tfPssZMapper.selectByExample(tpze);

                for(TfPss tfPss:tfPsses){
                    Order2Excel o2e=new Order2Excel();
                    o2e.setRemHead(mfps.get("remHead"));
                    o2e.setPsNo(mfps.get("psNo"));
                    o2e.setCusOsNo(mfps.get("cusOsNo"));
                    o2e.setPrdName(tfPss.getPrdName());
                    o2e.setPrdNo(tfPss.getPrdNo());
                    o2e.setQty(p.bigDecimal2StringSpace(tfPss.getQty()));


                }

            }























            /**
             *下面开始把读好的数据库数据封装到excel
             * */




            return null;
        } catch (Exception e) {
            String s = e.getMessage();
            l.error(s,e);
            if(s.contains(p.knownExceptionSign)){
                return Msg.gmg().setStatus(p.s0).setMsg(s);
            }else{
                return Msg.gmg().setStatus(p.s0).setMsg("未知异常");
            }
        }





    }





}
