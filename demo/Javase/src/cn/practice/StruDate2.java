package cn.practice;

import java.util.Date;

public class StruDate2 {
    public static void main(String[] args) {
        //构造方法 实例化对象
        Date d1 = new Date();
        Date d2 =  new Date(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        Date d3 = new Date(1676097794284L);
        System.out.printf("%tF %<tT%n",d1);
        System.out.printf("%tF %<tT%n",d2);
        System.out.printf("%tF %<tT%n",d3);

        //常用方法
        long now = d1.getTime();
        d1.setTime(now + (1000 * 60 * 60 * 24 * 10));
        //10天后 2023-02-21 14:55:31
        System.out.printf("%tF %<tT%n",d1);

        //计算两个日期之间的天数 1989-10-15出生到目前生活了多少天？
        Date ss = new Date(1989-1900,9,15,8,20,30);
        long t1 = ss.getTime();//1989-10-15 08:20:30
        System.out.printf("%tF %<tT%n",ss);
        System.out.printf("%tF %<tT%n",t1);
        long t2 = System.currentTimeMillis();//2023-02-11 15:17:17
        System.out.printf("%tF %<tT%n",t2);
        System.out.println((t2-t1)/(1000*60*60*24));//12172
    }
}
