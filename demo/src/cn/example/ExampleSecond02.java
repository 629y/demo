package cn.example;

import java.util.Calendar;
/**
 * <p>Description:输出今日是星期几</p>
 * <p>Class: ExportWeeek</p>
 * <p>Powered by zxy On 2023-04-09 02:29</p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleSecond02 {
    public static void main(String[] args) {
        var h = Calendar.getInstance();
        var s = String.format("今日是：%tF %<tT %<tB %<tA %<tp",h);

        System.out.println(s);
        //今日是：2023-04-09 02:29:38 四月 星期日 上午
        System.out.printf("%tA%n", System.currentTimeMillis());
        //星期日
    }
}
