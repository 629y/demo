package cn.practice;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * <p>Description:格式化数字  了解</p>
 * <p>Class:java.text.NumberFormat</p>
 * <p>Powered by zxy On 2023-04-10 15:50  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class FormatNumber01 {
    public static void main(String[] args) throws ParseException {
        int price = 18;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(nf.format(18));
        //输出:￥18.00

        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(price));
        //输出:$18.00

        nf = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        System.out.println(nf.format(price));
        //输出:18,00 ¤

        String str = "18,00 ¤";
        Number n1 = nf.parse(str);
        Number n = nf.parse(nf.format(price));
        System.out.println(n.doubleValue());
        System.out.println(n1.doubleValue());
        //输出 18.0

        double d = 0.5;
        nf = NumberFormat.getPercentInstance(Locale.CHINA);
        System.out.println(nf.format(d));
        //50%
    }
}
