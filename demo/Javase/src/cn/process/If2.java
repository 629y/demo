package cn.process;

import java.util.Calendar;
/**
 * <p>Description:星期几 几月</p>
 * <p>Class:if2</p>
 * <p>Powered by zxy On 2023-04-11 15:31  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class If2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //week 范围=1-7 1代表周日 2 周一
        int week = c.get(Calendar.DAY_OF_WEEK);

        //如下效率不好
        /*
        if (week==1) System.out.println("星期日");
        if (week==2) System.out.println("星期一");
        if (week==3) System.out.println("星期二");
        if (week==4) System.out.println("星期三");
        if (week==5) System.out.println("星期四");
        if (week==6) System.out.println("星期五");
        if (week==7) System.out.println("星期六");
        */

        if (week == 1) {
            System.out.println("星期日");
        } else if (week == 2) {
            System.out.println("星期一");
        } else if (week == 3) {
            System.out.println("星期二");
        } else if (week == 4) {
            System.out.println("星期三");
        } else if (week == 5) {
            System.out.println("星期四");
        } else if (week == 6) {
            System.out.println("星期五");
        } else {
            System.out.println("星期六");
        }
        System.out.printf("%tA%n", c);

        //一月
        System.out.printf("%tm%n", c);

        int m = c.get(Calendar.MONTH);
        if (m == 0) {
            System.out.println("一月");
        } else if (m == 1) {
            System.out.println("二月");
        } else if (m == 2) {
            System.out.println("三月");
        } else if (m == 3) {
            System.out.println("四月");
        } else if (m == 4) {
            System.out.println("五月");
        } else if (m == 5) {
            System.out.println("六月");
        } else if (m == 6) {
            System.out.println("七月");
        } else if (m == 7) {
            System.out.println("八月");
        } else if (m == 8) {
            System.out.println("九月");
        } else if (m == 9) {
            System.out.println("十月");
        } else if (m == 10) {
            System.out.println("十一月");
        } else {
            System.out.println("十二月");
        }
    }
}
