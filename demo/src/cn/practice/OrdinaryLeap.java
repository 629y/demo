package cn.practice;

public class OrdinaryLeap {
    public static void main(String[] args) {
        //判断int y = 2019;这个年份是不是闰年，程序输出闰年和平年？
        int y = 1000;
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}
