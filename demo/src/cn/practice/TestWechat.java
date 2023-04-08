package cn.practice;

public class TestWechat {
    public static void main(String[] args) {
        long t = System.currentTimeMillis() - 1000*60*60*24*60;
        System.out.println(t);
        System.out.println(WechatTimeEffect.wechatMsg(t)+":在线吗");
    }
}
