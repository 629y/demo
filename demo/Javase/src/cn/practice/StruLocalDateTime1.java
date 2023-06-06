package cn.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class StruLocalDateTime1 {
    public static void main(String[] args) {
        var d1= LocalDateTime.now();
        System.out.println(d1);
        System.out.printf("%tF %<tT %n",d1);
        System.out.printf("%tF%n",d1);
        System.out.printf("%tT%n",d1);
        System.out.printf("%tY年%<tm月%<td日 %<tH:%<tM:%<tS %<tA %<tp %s %n",d1,d1.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINA));

        //将字符串转换为LocalDateTime
        var d2=LocalDateTime.of(2022,10,17,14,49,50);
        System.out.println(d2);
        System.out.println(d2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        String str="2022-03-15 20:30:40";
        var d3=LocalDateTime.parse(str,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(d3);
     }
}
