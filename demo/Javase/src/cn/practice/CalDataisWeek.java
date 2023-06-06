package cn.practice;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalDataisWeek {
    public static void main(String[] args) {
        var data01 = LocalDate.of(2023,1,1);
        var dayisweek = data01.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINESE);
        System.out.printf("%tF这一天是%<tA",data01);
        //System.out.println("%tY年%<tm月%<td日 %<tA%n",data01);

    }
}
