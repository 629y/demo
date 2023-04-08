package cn.practice;

import java.util.Calendar;

public class TernaryIf {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int h = c.get(Calendar.HOUR_OF_DAY);
        String s = h<12?"上午":"下午";
        System.out.println(s);
    }
}
