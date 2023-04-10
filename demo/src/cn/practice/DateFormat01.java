package cn.practice;

import java.time.LocalDate;
import java.util.Date;

/**
 * <p>Description:**格式化日期**</p>
 * <p>Class:DateFormat</p>
 * <p>Powered by zxy On 2023-04-10 20:53  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class DateFormat01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.printf("%tY年%<tm月%<td日 %<ta %<tA %n", d1);
        System.out.printf("%tA%n", System.currentTimeMillis());
        System.out.printf("%tA", LocalDate.of(2000, 5, 1));
    }
}
