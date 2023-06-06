package cn.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * <p>Description:计算两个日期之间的天数</p>
 * <p>Class:ExampleSecond04</p>
 * <p>Powered by zxy On 2023-04-09 03:11  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleSecond04 {
    public static void main(String[] args) {
        //计算这两个日期的天数
        LocalDateTime a = LocalDateTime.of(2001,10,5,8,0,0);
        LocalDateTime b = LocalDateTime.now();
        long days = ChronoUnit.DAYS.between(a,b);

        System.out.printf("%tF %<tT 到 %tF %<tT 之间有 %d 天",a,b,days);
        //2001-10-05 08:00:00 到 2023-04-09 03:15:25 之间有 7855 天
    }
}
