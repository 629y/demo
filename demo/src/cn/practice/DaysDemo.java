package cn.practice;

import java.util.Calendar;

public class DaysDemo {
    public static void main(String[] args) {
        //计算两个日期之间有多少天
        var d1= Calendar.getInstance();
        //d1.set(1989,9,15);
        d1.set(1989,Calendar.OCTOBER,15);
        //1989-10-15 15:23:35
        System.out.printf("%tF %<tT%n",d1);

        var d2=Calendar.getInstance();
        //2023-02-09 15:27:21
        System.out.printf("%tF %<tT%n",d2);

        var days=(d2.getTimeInMillis()- d1.getTimeInMillis())/(1000*60*60*24);
        //1000*60*60*24
        //毫秒  秒 分钟 小时
        System.out.printf("%tF %<tT到%tF %<tT之间有%d天%n",d1,d2,days);
        //1989-10-15 15:35:41到2023-02-09 15:35:41之间有12170天
    }
}
