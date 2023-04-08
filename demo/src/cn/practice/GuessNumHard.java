package cn.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessNumHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] level = {100,200,500,1000,5000};
        int le = level[rand.nextInt(level.length)];
        int t = rand.nextInt(1,le+1);
        int num = 0;
        while(true){
            System.out.print("\033[34m请输入整数[1-"+le+"]:\033[0m");
            int n = sc.nextInt();
            ++num;
            if (n>t){
                System.out.printf("\033[31m%d、太大了\033[0m%n",num);
            } else if (n<t) {
                System.out.printf("\033[31m%d、太小了\033[0m%n",num);
            }else{
                System.out.printf("\033[32m恭喜，猜对了，游戏  \033[31m %d\033[0m \033[32m分\033[0m%n",110 - num * 10);
                break;
            }
        }
        System.out.println("\033[32m游戏结束\033[0m");
    }
}
