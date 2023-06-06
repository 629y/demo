package cn.example;

import java.util.Calendar;
import java.util.Random;
/**
 * <p>Description:生成指定范围的随机日期对象2000-01-01 00：00：00 - now</p>
 * <p>Class:ExampleSecond06</p>
 * <p>Powered by zxy On 2023-04-09 03:28  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleSecond06 {
    public static void main(String[] args) {
        var c1 = Calendar.getInstance();
        c1.set(2000, 1 - 1, 1, 0, 0, 0);
        var c2 = Calendar.getInstance();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            var time = rand.nextLong(c1.getTimeInMillis(), c2.getTimeInMillis());
            System.out.printf("%tF %<tT%n", time);
        }
    }
}
