package cn.example;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * <p>Description:计算5天前，6天后日期，指定月份1号，最后一天日期</p>
 * <p>Class:ExampleSecond05</p>
 * <p>Powered by zxy On 2023-04-09 03:17  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleSecond05 {
    public static void main(String[] args) {
        var now = LocalDate.now();
        System.out.printf("%tF %n",now);
        //2023-04-09
        System.out.printf("%tF %n",now.minusDays(5));
        //2023-04-04  minusDays-5天
        System.out.printf("%tF %n",now.plusDays(6));
        //2023-04-15 plusDays+6天

        System.out.printf("%tF %n",now.minusDays(now.getDayOfMonth()-1));
        //2023-04-01     当月1号日期
        System.out.printf("%tF %n",now.with(TemporalAdjusters.firstDayOfMonth()));
        //2023-04-01     当月1号日期
        System.out.printf("%tF %n",now.with(TemporalAdjusters.lastDayOfMonth()));
        //2023-04-30  当前月的最后一天日期
    }
}
