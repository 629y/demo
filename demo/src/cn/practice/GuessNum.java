package cn.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        int t = rand.nextInt(1,101);
        while (true){
            System.out.print("请输入整数[1-100]:");
            int n = sc.nextInt();
            if (n>t){
                System.out.printf("太大了%n");
            }else if(n<t){
                System.out.printf("太小了%n");
            }else{
                System.out.printf("恭喜，猜对了%n");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
