package cn.practice3;

import java.util.Calendar;

public class StrApi1 {
    public static void main(String[] args) {
        String str = "日一二三四五六";
        //toCharArray()
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);//日

        //charAt(0)
        System.out.println(str.charAt(0));//日
        Calendar c = Calendar.getInstance();
        int w = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("星期"+str.charAt(w-1));//星期二
        System.out.println("星期"+chars[w-1]);//星期二
    }
}
