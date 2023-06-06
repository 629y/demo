package cn.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StruDate1 {
    public static void main(String[] args) throws ParseException {
        // 2000-12-16    2000.12.16  定义输出格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 将字符串转化为日期
        Date date = sdf.parse("2000-11-11 11:11:11");
        System.out.println(date);//Sat Nov 11 11:11:11 CST 2000

        Date date1 = new Date();
        // 将日期转化为字符串
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = sdf1.format(date1);
        System.out.println(str);//2023-02-11 14:30:59

        var now = new Date(); // 创建一个Date对象，获取当前时间
        // 指定格式化格式
        var f = new SimpleDateFormat("今天是 " + "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
        System.out.println(f.format(now));// 将当前时间袼式化为指定的格式
        //今天是 2023 年 02 月 11 日 周六 14 点 33 分 56 秒
    }
}
