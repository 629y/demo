package cn.practice;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * <p>Description:格式化百分比、货币、千分位</p>
 * <p>Class:DecimalFormat02</p>
 * <p>Powered by zxy On 2023-04-10 20:42  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class DecimalFormat02 {
    public static void main(String[] args) {
        //格式化百分比
        double d = Math.random();
        System.out.println(d);//0.012607079852532954
        System.out.printf("格式化：%.2f%n", d);//格式化：0.01
        NumberFormat nf = NumberFormat.getPercentInstance();
        System.out.println("百分比:" + nf.format(d));//百分比:1%
        //格式化加小数
        nf.setMinimumFractionDigits(2);
        System.out.println("百分比:" + nf.format(d));//百分比:1.26%

        //格式化货币
        double money = 2342120.1268;
        System.out.println(money);//2342120.1268
        NumberFormat nffus = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nffus.format(money));//$2,342,120.13
        NumberFormat nffcn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        nffcn.setMaximumFractionDigits(1);
        System.out.println(nffcn.format(money));//¥2,342,120.1
        System.out.printf("¥%.2f%n", money);//¥2342120.13

        //格式化千分位
        long n = 2421482839492L;
        double nn = Math.random();
        NumberFormat nf3 = NumberFormat.getNumberInstance();
        System.out.println(nf3.format(n));//2,421,482,839,492
        System.out.println(nn);//0.8236233035550812
        nf3.setMinimumFractionDigits(4);
        System.out.println(nf3.format(nn));//0.8236
        System.out.printf("%.4f%n", nn);//0.8236
    }
}
