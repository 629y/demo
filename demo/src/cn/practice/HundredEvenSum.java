package cn.practice;

import java.util.stream.IntStream;

public class HundredEvenSum {
    public static void main(String[] args) {
        //IntStream interface java 1.8新技术 流技术
//        int sum = IntStream.rangeClosed(1,100).sum();
//        System.out.println("1+2+3+...+100="+sum);

        //其中，求偶数和
        int sum = IntStream.rangeClosed(1,100).filter(e->e%2==0).sum();
        System.out.println("2+4+6+...+100="+sum);

        //其中，求偶数和
//        int s=0;
//        for (int i = 1; i <= 100; i++) {
//            if (i%2==0){
//                s+=i;
//            }
//        }
//        System.out.println(s);
    }
}
