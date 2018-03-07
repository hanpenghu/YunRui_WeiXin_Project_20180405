import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
public class Test {
    public static void main(String[]args) throws ParseException {
//            System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2017-09-12 11:12:12"));
//           System.out.println( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS").format(new java.util.Date()));
//           System.out.println(UUID.randomUUID().toString());
        //测试java8 list改变内部String
//        List<String> strList=new ArrayList();
//        strList.add("a");
//        strList.add("b");
//        strList.add("c");
//        System.out.println(strList);
//        strList = strList.stream().hashmap(v -> "~" + v + "~").collect(Collectors.toList());
//        System.out.println(strList);
        Map<String,String> map=new LinkedHashMap<>();
        map.put("1","2");
        map.put("1","3");
        System.out.println(map);//key相同,会覆盖
    }
}
