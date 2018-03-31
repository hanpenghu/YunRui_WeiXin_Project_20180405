package test.testPath;


import com.winwin.picreport.Futils.hanhan.p;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Test001 {

    @Scheduled(fixedDelay = 2*1000,initialDelay = 10*1000)
    public  void f(){
        String s = p.duDangQianLeiMuLuXiaDeWenJian
                ("\\test\\testPath\\1.txt", Test001.class, p.UTF8);

        p.p("-------------------------------------------------------");
        p.p(s);
        p.p("-------------------------------------------------------");
    }


    public static void main(String[]args){
        //这样读不到资源
        Test001 test001 = new Test001();
        test001.f();
    }

}
