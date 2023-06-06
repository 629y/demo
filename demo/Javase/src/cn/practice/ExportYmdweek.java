package cn.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class ExportYmdweek {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        System.out.printf("%tB%n",now);//二月

        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINA));//二月
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy年MM 月dd日 HH:mm:ss E")));
        //2023年02月11日 10:58:35 周六
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));//星期六
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.CHINA));//周六
    }
}
