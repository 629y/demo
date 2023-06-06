package cn.process;

import java.util.Calendar;
/**
 * <p>Description:三元运算表达式，可以简单代替if(){}else{}语句</p>
 * <p>Class:TernaryIf</p>
 * <p>Powered by zxy On 2023-04-11 16:05  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class TernaryIf {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int h = c.get(Calendar.HOUR_OF_DAY);
        String s = h<12?"上午":"下午";
        System.out.println(s);
    }
}
