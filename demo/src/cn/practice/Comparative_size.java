package cn.practice;

import java.util.Scanner;

public class Comparative_size {
    public static void main(String[] args) {
        //使用户可以从键盘输入两个数，并判断这两个数之间的大小
        int number1,number2;
        System.out.print("请输入第一个整数：");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        System.out.print("请输入第二个整数：");
        Scanner input1 = new Scanner(System.in);
        number2 = input.nextInt();
        System.out.printf("number1=%d,number2=%d\n",number1,number2);
        //判断用户输入的两个数是否相等
        if (number1 == number2){
            System.out.println("您输入的两位数相等");
        }
        if (number1 != number2){
            System.out.println("您输入的两位数不相等");
        }
        if (number1 > number2){
            System.out.println("您输入的第一位数大于第二位数");
        }
        if (number1 < number2){
            System.out.println("您输入的第一位数小于第二位数");
        }
    }
}
