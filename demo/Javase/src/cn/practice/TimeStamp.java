package cn.practice;

public class TimeStamp {
    public static void main(String[] args) {
        long ss = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        long ee = System.currentTimeMillis();
        System.out.printf("ms:%d %n", ee - ss);
        System.out.println(System.currentTimeMillis());
        System.out.printf("%tF %<tT%n", 0L);
        //格林威治时间1970年01月01日00时00分00秒(北京时间1970年01月01日08时00分00秒)
        System.out.printf("%tF %<tT%n", 1676033611399L);
        //1676033611399L - 时间戳
        //currentTimeMillis()得到当前时间戳
    }
}
