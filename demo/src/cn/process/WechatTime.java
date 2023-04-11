package cn.process;
/**
 * <p>Description:微信信息时间显示效果案例</p>
 *  2022 10 19 17:46:30 刚刚
 *  5分钟前
 *  2小时前
 *  3天前
 *  2022 10 19 17：46：30
 * <p>Class:</p>
 * <p>Powered by zxy On 2023-04-11 15:58  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class WechatTime {
    public static void main(String[] args) {
        //留言时间
        //long t = 1681215457508L - (1000 * 60 * 60 * 24 * 12);

        long t = 1681215457508L - (1000 * 60 * 5);//5分钟前
        //long t = 1681215457508L - (1000 * 60 * 60*2);//2小时前
        //long t = 1681215457508L - (1000 * 60 * 60*24*3);//3天前
        //t = System.currentTimeMillis();
        System.out.println(t);
        String msg = "你好，在吗？";
        long c = System.currentTimeMillis() - t;
        long m = c / (1000 * 60);//一分钟
        long h = c / (1000 * 60 * 60);//一小时
        long d = c / (1000 * 60 * 60 * 24);//一天
        if (c < (1000 * 60)) {
            System.out.printf("刚刚:%s", msg);//一分钟内留言
        } else if (m >= 1 && h < 1) {
            System.out.printf("%d分钟前：:%s", m, msg);
        } else if (h >= 1 && d < 1) {
            System.out.printf("%d小时前：:%s", h, msg);
        } else if (d >= 1 && d <= 7) {
            System.out.printf("%d天前：:%s", d, msg);
        } else {
            System.out.printf("%tF %<tT：:%s%n", t, msg);
        }
    }
}
