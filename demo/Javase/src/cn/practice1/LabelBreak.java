package cn.practice1;

public class LabelBreak {
    public static void main(String[] args) {
        ss:
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%03d%n", i);
            System.out.println("-------------");
            while (true) {
                double d = Math.random();
                System.out.println(d);
                if (d > .8) {
                    break ss;
                    //直接跑到ss  循环语句结束
                    //continue ss;
                    //跳转到ss,继续循环
                }
            }
        }
    }
}
