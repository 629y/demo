package cn.practice;

public class DiamondShape2 {
    public static void main(String[] args) {
        int ss =21;
        int s = ss/2+1;
        for (int i=1;i<=ss;i+=2){
            System.out.printf("%s%s%n"," ".repeat(--s),"*".repeat(i));
        }
        for (int i = ss-2;i>=1;i-=2){
            System.out.printf("%s%s%n"," ".repeat(++s),"*".repeat(i));
        }
    }
}
