package cn.practice;

import java.util.Random;

public class RandomDiamondShape {
    public static void main(String[] args) {
        int ss=21;
        int s=ss/2+1;
        Random rand=new Random();
        for (int i = 1;i<=ss;i+=2){
            System.out.printf("%s\033[%dm%s\033[0m%n"," ".repeat(--s),rand.nextInt(31,36),"*".repeat(i));
        }
        for (int i = ss-2;i>=1;i-=2){
            System.out.printf("%s\033[%dm%s\033[0m%n"," ".repeat(++s),rand.nextInt(31,36),"*".repeat(i));
        }
    }
}
