package cn.practice1;

public class Recursion {
    static void m1(int i) {
        if (i >= 0) {
            System.out.println(i);
            m1(--i);
        }
    }
    static void m2(int i) {
        if (i >= 0) {
            m2(--i);
            System.out.printf("%d ",i+1);
        }
    }
    public static void main(String[] args) {
        System.out.println("---");//6 5 4 3 2 1 0
        m1(6);
        System.out.println("---");
        m2(6);//0 1 2 3 4 5 6
    }
}
