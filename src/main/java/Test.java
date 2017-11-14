import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[]args) throws ParseException {
//            System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2017-09-12 11:12:12"));
//           System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS").format(new java.util.Date()));
//           System.out.println(UUID.randomUUID().toString());
        //测试java8 list改变内部String
        List<String> strList=new ArrayList();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        System.out.println(strList);
        strList.stream().map(v->v=("~"+v+"~")).collect(Collectors.toList());
        System.out.println(strList);

    }



}
