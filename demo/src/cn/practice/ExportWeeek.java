package cn.practice;

import java.util.Calendar;

public class ExportWeeek {
    public static void main(String[] args) {
        var h = Calendar.getInstance();
        var s = String.format("今日是：%tF %<tT %<tB %<tA %<tp",h);
        //今日是：2023-02-11 10:41:31 二月 星期六 上午
        System.out.println(s);
        System.out.printf("%tA%n", System.currentTimeMillis());
    }
}
