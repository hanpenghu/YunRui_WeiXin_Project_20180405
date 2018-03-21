package com.winwin.picreport.Bcontroller.xiaoShouDingDanDaoRuDaoChuExcel.servicesBatchRefactor.OrderToErp;
import com.winwin.picreport.Edto.MfPosWithBLOBs;
import com.winwin.picreport.Edto.Sapso;
import com.winwin.picreport.Edto.TfPosWithBLOBs;
import com.winwin.picreport.Edto.TfPosZ;
import com.winwin.picreport.Futils.hanhan.p;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class CommonOrderBatchToDb {
    private  org.apache.log4j.Logger l = org.apache.log4j.LogManager.getLogger(this.getClass().getName());
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    /**
     *批处理进入数据库
     * */
    @Transactional
    public void f(MfPosWithBLOBs mm, List<TfPosWithBLOBs> tfPosWithBLOBsList, List<TfPosZ> tfPosZList, List<Sapso> sapsoList,String sap){
        SqlSession session =sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
        try{

            //com.aiBanShi.ErpToShop.dao.mapperJava2.UsersMapper.insert
            //中的com.aiBanShi.ErpToShop.dao.mapperJava2.UsersMapper是mapper.xml中的nameSpace
            //insert是mapper.xml中insert那个sql
            session.insert("com.winwin.picreport.Ddao.reportxmlmapper.MfPosMapper.insert",mm);
            if(p.dy("sap",sap)){
                //如果是sap的就用这步
                for(Sapso s:sapsoList){
                    session.insert("com.winwin.picreport.Ddao.reportxmlmapper.SapsoMapper.insert",s);
                }
            }
            for(TfPosWithBLOBs t:tfPosWithBLOBsList){
                session.insert("com.winwin.picreport.Ddao.reportxmlmapper.TfPosMapper.insert",t);
            }
            for(TfPosZ tz:tfPosZList){
                session.insert("com.winwin.picreport.Ddao.reportxmlmapper.TfPosZMapper.insert",tz);
            }
            session.commit();
            //清理缓存，防止溢出
            session.clearCache();
        }catch(Exception e){
            session.rollback();
            session.close();
            l.error(e.getMessage(),e);
            e.printStackTrace();
            throw new RuntimeException("订单批处理失败！");
        }finally {
            session.close();
        }

    }

}
