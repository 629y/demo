package cn.practice1;

public class OverloadedMethod {
    static int sum() {
        return 0;
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static double sum(float a, float b) {
        return a + b;
    }
    static double sum(double a, double b) {
        return a + b;
    }
    public static void show() {
        System.out.println("show...");
    }
}
