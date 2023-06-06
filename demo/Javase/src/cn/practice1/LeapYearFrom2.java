package cn.practice1;

public class LeapYearFrom2 {
    public static void main(String[] args) {
        //编程打印出2000 到 现在年份闰年
        for (int year = 2000;year<=2023;year++) {
            if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
                System.out.printf("%d是闰年%n", year);
            }
        }
    }
}
