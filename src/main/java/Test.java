import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

    public static void main(String[]args) throws ParseException {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2017-09-12 11:12:12"));
    }
}
