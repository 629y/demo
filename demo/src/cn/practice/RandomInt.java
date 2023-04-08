package cn.practice;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        //生成1-100之间的随机整数？
        Random rand = new Random();
        int number = rand.nextInt(1,101);

        //(0-99) + 1
        int number1 =rand.nextInt(100) + 1;
        System.out.println(number);
        System.out.println(number1);
    }
}
