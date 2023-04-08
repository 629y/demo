package cn.practice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StruLocalTime {
    public static void main(String[] args) {
        //LocalTime 实例化
        var t1 = LocalTime.now();
        var t2 = LocalTime.of(14, 30, 20);
        var t3 = LocalTime.parse("19:23:25", DateTimeFormatter.ofPattern("HH:mm:ss"));

        //简单输出
        System.out.println(t1);//08:44:09.385507600
        System.out.printf("%tT%n", t1);//08:44:09
        System.out.println(t2);//14:30:20
        System.out.println(t3);//19:23:25

        //格式化输出
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH时mm分ss秒");
        System.out.println(df.format(t1));
        System.out.println(df.format(t2));
        System.out.println(df.format(t3));
        System.out.println(t1.plusSeconds(1000));
        //把1000秒加到t1中

        var sns = t1.plusSeconds(1000).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(sns);
        //把1000秒加到t1中  格式化输出

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.printf("%tT%n", time);
        System.out.printf("%tH时%<tM分%<tS秒%n", time);
        System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
