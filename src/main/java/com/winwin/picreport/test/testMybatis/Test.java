//package com.winwin.picreport.test.testMybatis;
//
//
//import com.winwin.picreport.Ddao.reportxmlmapper.LxMapper;
//import com.winwin.picreport.Edto.Lx;
//import com.winwin.picreport.Futils.hanhan.p;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Test {
//    @Autowired
//    private LxMapper lxMapper;
//    @Scheduled(fixedDelay =3*1000)
//    public void f(){
//        Lx l=new Lx() ;
//        l.setId("1");
//        l.setName(null);
//        int i = lxMapper.updateByPrimaryKey(l);
//        p.p("-------------------------------------------------------");
//        p.p(i);
//        p.p("-------------------------------------------------------");
//    }
//
//
//}
