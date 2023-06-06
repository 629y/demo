package cn.practice;

import java.util.Calendar;
import java.util.Date;

public class StruCalendarDate1 {
    public static void main(String[] args) {
        //获取实例对象
        var c = Calendar.getInstance();
        //c.set();c.get();
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(new Date().getHours());
        //c.add();  设置-7天，获取7天前的日期
        c.add(Calendar.DATE,-7);

        //日历类转换为Date类
        Date d=c.getTime();
        System.out.printf("%tF %<tT%n",d);
        //日历类获取时间戳
        long ts =  c.getTimeInMillis();
        System.out.printf("%tF %<tT%n",ts);
        System.out.printf("%tF %<tT%n",c);
    }
}
