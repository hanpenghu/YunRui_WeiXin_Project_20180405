import java.util.List;
import java.util.ArrayList;
public class TestListString {
    public static void main(String[]args){
        List<Ob>list=new ArrayList<>();
        list.add(new Ob().setStr("1"));list.add(new Ob().setStr("2"));list.add(new Ob().setStr("3"));
        System.out.println(list);
        list.forEach(v->{
            v.setStr("~"+v.getStr()+"~");
        });
        System.out.println(list);
    }
}
class Ob{
    private String str="";
    public String getStr() {
        return str;
    }
    public Ob setStr(String str) {
        this.str = str;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ob{");
        sb.append("str='").append(str).append('\'');
        sb.append('}');
        return sb.toString();
    }
}