package cn.practice1;

public class DiamondShapeText {
    public static void main(String[] args) {
        //编程代码实现打印菱形效果图案
        int length = 23;
        int interval = length / 2 + 1;
        for (int i = 1; i<= length;i+=2){
            System.out.printf("%s%s%n"," ".repeat(- -interval),"*".repeat(i));
        }
        for (int i = length - 2;i>= 1;i-=2){
            System.out.printf("%s%s%n"," ".repeat(++interval),"*".repeat(i));
        }
    }
}
