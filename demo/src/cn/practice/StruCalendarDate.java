package cn.practice;

import java.util.Calendar;
import java.util.Date;

public class StruCalendarDate {
    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        // 将系统当前时间赋值给 Calendar 对象
        System.out.println("现在时刻：" + calendar1.getTime()); //现在时刻：Sat Feb 11 18:13:31 CST 2023

        int year = calendar1.get(Calendar.YEAR);
        System.out.println("现在是" + year + "年");//现在是2023年
        int month = calendar1.get(Calendar.MONTH) + 1; // 获取当前月份（月份从 0 开始，所以加 1）
        System.out.print(month + "月");
        int day = calendar1.get(Calendar.DATE); // 获取日
        System.out.print(day + "日");
        System.out.print(" ");

        int week = calendar1.get(Calendar.DAY_OF_WEEK) - 1; // 获取今天星期几（以星期日为第一天）
        System.out.print("星期" + week);
        System.out.print(" ");
        int hour = calendar1.get(Calendar.HOUR_OF_DAY); // 获取当前小时数（24 小时制）
        System.out.print(hour + "时");
        int minute = calendar1.get(Calendar.MINUTE);
        System.out.print(minute + "分");
        int second = calendar1.get(Calendar.SECOND);
        System.out.print(second + "秒");
        int millisecond = calendar1.get(Calendar.MILLISECOND);
        System.out.print(millisecond + "毫秒");
        System.out.print(" ");

        int dayOfMonth = calendar1.get(Calendar.DAY_OF_MONTH); // 获取今天是本月第几天
        System.out.println("今天是本月的第 " + dayOfMonth + " 天");//今天是本月的第 11 天
        int dayOfWeekInMonth = calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH);// 获取今天是本月第几周
        System.out.println("今天是本月第 " + dayOfWeekInMonth + " 周");
        int many = calendar1.get(Calendar.DAY_OF_YEAR); // 获取今天是今年第几天
        System.out.println("今天是今年第 " + many + " 天");

        Calendar c = Calendar.getInstance();
        c.set(2012, 8, 8); // 设置年月日，时分秒将默认采用当前值
        System.out.println("设置日期为 2012-8-8 后的时间：" + c.getTime());
        //设置日期为 2012-8-8 后的时间：Sat Sep 08 18:21:30 CST 2012
    }
}
