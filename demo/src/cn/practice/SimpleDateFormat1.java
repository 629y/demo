package cn.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 * <p>Description:格式化日期</p>
 * <p>Class:SimpleDateFormat</p>
 * <p>Powered by zxy On 2023-04-10 20:57 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class SimpleDateFormat1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //java.util.Date()
        Date d = new Date();
        System.out.println(sdf.format(d));//2023-04-10 20:58:57

        // 指定格式化格式
        var f = new SimpleDateFormat("今天是 " + "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
        Date now = new Date();
        System.out.println(f.format(now)); // 将当前时间袼式化为指定的格式
        //今天是 2023 年 04 月 10 日 周一 20 点 58 分 57 秒

        //Date 对象 格式化
        Date d1 = new Date();
        System.out.printf("%tF %<tT %<Ta %<tA %<tb %<tB %<tp%n", d1);
        //2023-04-10 20:58:57 周一 星期一 4月 四月 下午

        System.out.printf("%tH %<tM %<tS%n", d1);
        //20 58 57

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = sdf1.format(d1);
        System.out.println(str);//2023-04-10 20:58:57
        System.out.println(sdf2.format(d1));//20230410205857

        var sd1 = new SimpleDateFormat("MM月dd日 E a M");
        System.out.println(sd1.format(d1));
        //04月10日 周一 下午 4

        //请输出今日日期格式为 2020年1２月12日 ２２:３３:３３ 星期几
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        System.out.println(sdf3.format(d));//2023年04月10日 20:58:57 周一

        //java.time.DateTimeFormatter
        LocalDate d11 = LocalDate.now();
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy.MM.dd E");
        System.out.println(d11.format(df1));//2023.04.10 周一

        LocalDateTime d2 = LocalDateTime.now();
        System.out.println(d2);//2023-04-10T20:58:57.360631200
        System.out.printf("%tF %<tT%n", d2);//2023-04-10 20:58:57
        System.out.println(d2.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss E ")));
        //2023年04月10日 20:58:57 周一
        System.out.println(d2.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
        //20230410205857
    }
}
