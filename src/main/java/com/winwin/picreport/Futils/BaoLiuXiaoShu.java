package com.winwin.picreport.Futils;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class BaoLiuXiaoShu {
    double f = 111231.5585;
    public static Double m1(Double f,int xiaoShuDianHouDeWeiShu) {
        BigDecimal bg = new BigDecimal(f);
        double f1 = bg.setScale(xiaoShuDianHouDeWeiShu, BigDecimal.ROUND_HALF_UP).doubleValue();
//        System.out.println(f1);
        return f1;
    }
    /**
     * DecimalFormat转换最简便
     */
    public void m2() {
        DecimalFormat df = new DecimalFormat("#.000");
//        System.out.println(df.format(f));
    }
    /**
     * String.format打印最简便,四舍五入
     */
    public static String m3SiSheWuRuBianStr(Double f,int xiaoShuDianHouDeWeiShu) {
        return String.format("%." + xiaoShuDianHouDeWeiShu + "f", f);
    }
    public void m4() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        System.out.println(nf.format(f));
    }
    public static void main(String[] args) {
        BaoLiuXiaoShu f = new BaoLiuXiaoShu();
        f.m1(111231.5585,3);
        f.m2();
//       System.out.println(f.m3SiSheWuRuBianStr(111231.5585,3)); ;
        f.m4();
    }
}
