package cn.practice;

public class WechatTime {
    public static void main(String[] args) {
        //留言时间
        long t = 1676377898293L - (1000 * 60 * 60 * 24 * 12);

        //long t = 1676377898293L - (1000 * 60 * 5);//5分钟前
        //long t = 1676377898293L - (1000 * 60 * 60*2);//2小时前
        //long t = 1676377898293L - (1000 * 60 * 60*24*3);//3天前
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
