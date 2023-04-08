package cn.text03;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        //编程实现猜数游戏案例
        Random random = new Random();
        int[] number = {100, 200, 300, 400, 500};
        int arr = number[random.nextInt(number.length)];
        int target = random.nextInt(arr) + 1;
        int count = 0;
        int num;
        System.out.printf("请输入[1-%d]的数字:", arr);
        Scanner input = new Scanner(System.in);
        while (true) {
            count++;
            try {
                num = input.nextInt();
            } catch (Exception e) {
                if ("exit".equalsIgnoreCase(input.next())) {
                    System.out.println("程序已退出");
                    break;
                }
                System.out.print("当前输入\033[31m并非数字\033[0m，请重新输入:");
                continue;
            }
            if (num > target) {
                System.out.print("当前数字\033[31m大于目标数字\033[0m，请重新输入:");
            } else if (num < target) {
                System.out.print("当前数字\033[31m小于目标数字\033[0m，请重新输入:");
            } else {
                System.out.printf("\n恭喜你猜对了，累计猜\033[35m%d\33[0m次！\n", count);
                break;
            }
        }
    }
}

