package cn.practice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class StruLocalDateTime2 {
    //private static LocalDateTime date;

    public static void main(String[] args) {
        //java.time.LocalDateTime & java.time.DateTimeFormatter
        //获取一天的开始时间
        //LocalDate now = LocalDate.now();
        //var ss= LocalDateTime.of(now, LocalTime.MIN);
        LocalDate date = LocalDate.of(2023,2,18);
        var ss= LocalDateTime.of(date, LocalTime.MIN);
        System.out.println("--------------");
        System.out.println(ss);//2023-02-18T00:00
        System.out.println(ss.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));//2023-02-18 00:00:00

        //获取一天的结束时间

       //var endOfTheDay = LocalDateTime.of(now,LocalTime.MAX);
        var endOfTheDay = LocalDateTime.of(date,LocalTime.MAX);
        System.out.println(endOfTheDay);//2023-02-18T23:59:59.999999999
        System.out.println(endOfTheDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));//2023-02-18 23:59:59

        //将LocalDateTime 对象  获取 毫秒时间戳
        long ms = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println(ms);//1676707914598
        System.out.println(System.currentTimeMillis());//1676707914599
        System.out.printf("%tF %<tT%n",LocalDateTime.now());//2023-02-18 16:11:54

        //获取系统毫秒  时间戳
        long mm = Instant.now().toEpochMilli();

        Date d = new Date(ms);
        System.out.printf("%tF %<tT%n",d);//2023-02-18 16:11:54

        Calendar c=Calendar.getInstance();
        c.setTimeInMillis(1676368128327L);
        System.out.printf("%tF %<tT%n",c);//2023-02-14 17:48:48

    }
}
