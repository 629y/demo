package cn.practice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StruLocalDateTime {
    public static void main(String[] args) {
        //计算两个日期之间的天数
        LocalDateTime a = LocalDateTime.of(2001,10,5,8,0,0);
        LocalDateTime b = LocalDateTime.now();
        long days = ChronoUnit.DAYS.between(a,b);
        System.out.printf("%tF %<tT到%tF %<tT 之间有%d天",a,b,days);
        //2001-10-05 08:00:00到2023-02-11 19:37:03 之间有7799天
    }
}
