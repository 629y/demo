package cn.example;
/*
* Copyright (c) 2017, 2023, zxy.cn All rights reserved.
*
*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
/**
 * <p>Description:输出 xxxx年xx月xx日 xx:xx:xx 星期几</p>
 * <p>Class:ExportYmdweek</p>
 * <p>Powered by zxy On 2023-04-09 03:01  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleSecond03 {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        System.out.printf("%tB%n",now);
        //四月

        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL, Locale.CHINA));
        //四月

        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E")));
        //2023年04月09日 03:02:48 周日

        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));
        //星期日

        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.CHINA));
        //周日
    }
}
