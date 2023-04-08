package cn.practice;

public class While1 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println(i++);
        }
        --i;
        while(i>=1){
            System.out.printf("%03d\t",i);
            --i;
        }
    }
}
