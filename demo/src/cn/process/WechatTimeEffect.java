package cn.process;

import java.util.Calendar;
import java.util.Date;

public final class WechatTimeEffect {
    public static String wechatMsg(long time) {
        String info = " ";
        long c = System.currentTimeMillis() - time;
        long m = c / (1000 * 60);//一分钟
        long h = c / (1000 * 60 * 60);//一小时
        long d = c / (1000 * 60 * 60 * 24);//一天
        if (c < (1000 * 60)) {
            info = "刚刚";//一分钟内留言
        } else if (m >= 1 && h < 1) {
            info = String.format("%d分钟前", m);
        } else if (h >= 1 && d < 1) {
            info = String.format("%d小时前", h);
        } else if (d >= 1 && d <= 7) {
            info = String.format("%d天前", d);
        } else {
            info = String.format("%tF %<tT", time);
        }
        return info;
    }
    public String wechatMsg(Date dat){
        return wechatMsg(dat.getTime());
    }
    public String wechatMsg(Calendar cal){
        return wechatMsg(cal.getTimeInMillis());
    }
}
