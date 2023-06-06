package cn.practice;

import java.text.NumberFormat;
import java.util.Locale;
/**
 * <p>Description:格式化货币</p>
 * <p>Class:FormatNumber02</p>
 * <p>Powered by zxy On 2023-04-10 20:01  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class FormatNumber02 {
    public static void main(String[] args) {
        int a = 1424248;
        float b = .5F;
        int c = 3;
        System.out.printf("%03d %d %.3f%n", c, a, b);
        //003 1424248 0.500

        //格式化货币
        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        nf1.setMinimumFractionDigits(5);
        System.out.println(nf1.format(a));
        //¥1,424,248.00000
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf2.format(a));
        //$1,424,248.00

        int n1 = 0;
        int n2 = 0;
        //创建一个数值格式化对象
        NumberFormat nf = NumberFormat.getInstance();
        //设置精确到小数点后2位
        nf.setMaximumFractionDigits(2);
        String res1;
        if(n2 == 0){
        //除数不能为0
            res1 = "0";
        }else{
            res1 = nf.format((float) n1 / (float) n2 * 100);
        }
        System.out.println("百分比为：" + res1 + "%");
        //百分比为：0%
    }
}