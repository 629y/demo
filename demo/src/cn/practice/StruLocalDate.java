package cn.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class StruLocalDate {
    public static void main(String[] args) {
        //实例化
        LocalDate d1=LocalDate.now();
        var d2 = LocalDate.of(1985,10,17);

        //常用操作 c++  今日5天后日期
        System.out.println(d1.plusDays(5));
        //今日3天前日期
        System.out.println(d1.minusDays(3));
        //今日25个月后的新日期
        System.out.println(d1.plus(25, ChronoUnit.MONTHS));

        //今日日期的月份 中文效果： 十月
        var daymonth = d1.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINESE);
        System.out.println(daymonth);

        var dayweek = d1.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.CHINESE);
        System.out.println(dayweek);

        var dayweek1 = d1.getDayOfWeek().getDisplayName(TextStyle.SHORT,Locale.CHINESE);
        System.out.println(dayweek1);

        System.out.println("----------------");
        //计算两个日期之间的天数
        long days = ChronoUnit.DAYS.between(d2,d1);
        System.out.printf("%s 到 %s 之间有 %d 天",d2,d1,days);
        System.out.println();
        //格化输出
        System.out.println(d1);
        System.out.println(d2);
        System.out.printf("%tF%n",d1);
        System.out.printf("%tF%n",d2);
        System.out.printf("%tY年%<tm月%<td日 %<tA%n",d1);
        System.out.printf("%tY年%<tm月%<td日 %<tA%n",d2);
        System.out.println(d1.isLeapYear());
        //专业的格式工具类java.time.DateTimeFormatter
        var fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日 E M L");
        var fmt1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 E M L",Locale.CHINA);
        System.out.println(fmt.format(d1));
        System.out.println(fmt.format(d2));
        System.out.println(fmt1.format(d1));
        System.out.println(fmt1.format(d2));
    }
}
