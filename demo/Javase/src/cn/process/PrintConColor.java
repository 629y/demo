package cn.process;

import java.util.Random;

/**
 * <p>Description:输出控制颜色</p>
 * <p>Class:print</p>
 * <p>Powered by zxy On 2023-04-11 15:19  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class PrintConColor {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 1; i <= 55; i++) {
            System.out.printf("\033[%d;%dm hello world \033[0m ", rand.nextInt(30, 39), rand.nextInt(40, 49));
            if (i % 5 == 0) {
                System.out.println();
                System.out.println();
            }
        }
        //控制输出颜色 背景 前景
        System.out.println("\033[30m hello 30 world \033[0m");
        System.out.println("\033[31m hello 31 world \033[0m");
        System.out.println("\033[32m hello 32 world \033[0m");
        System.out.println("\033[33m hello 33 world \033[0m");
        System.out.println("\033[34m hello 34 world \033[0m");
        System.out.println("\033[35m hello 35 world \033[0m");
        System.out.println("\033[36m hello 36 world \033[0m");
        System.out.println("\033[37m hello 37 world \033[0m");
        System.out.println("\033[38m hello 38 world \033[0m");
        //文字颜色为30 黑色 背景为44 紫色
        System.out.println("\033[30;44m hello 40 world \033[0m");
        System.out.println("\033[41m hello 41 world \033[0m");
        System.out.println("\033[42m hello 42 world \033[0m");
        System.out.println("\033[43m hello 43 world \033[0m");
        System.out.println("\033[44m hello 44 world \033[0m");
        System.out.println("\033[45m hello 45 world \033[0m");
        System.out.println("\033[46m hello 46 world \033[0m");
        System.out.println("\033[47m hello 47 world \033[0m");
        System.out.println("\033[48m hello 48 world \033[0m");
    }
}
