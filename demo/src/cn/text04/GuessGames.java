package cn.text04;

import java.util.Random;
import java.util.Scanner;

public class GuessGames {
    public static void main(String[] args) {
        //编程实现猜数游戏，使用try catch处理异常。
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int t = rand.nextInt(1, 101);
        while (true) {
            System.out.print("请输入[1-100] : ");
            int n = 0;
            try {
                n = sc.nextInt();
                if (n < 1 || n > 100) {
                    System.out.println("必须输入1-100整数");
                    continue;
                }
            } catch (Exception e) {
                if ("quit".equalsIgnoreCase(sc.next())) {
                    System.out.println("游戏结束");
                    break;
                } else {
                    System.out.println("必须输入整数");
                    continue;
                }
            }

        }

    }
}