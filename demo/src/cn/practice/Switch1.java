package cn.practice;

import java.util.Calendar;

public class Switch1 {
    public static void main(String[] args) {
        //switch 多分支开关语句
        //int n = Calendar.getInstance().get(7);
        //1-7 int byte char short String enum

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE,-1);
        int n = c.get(7);

        switch (n) {
            case 1:
                System.out.println("星期日");
                break;
            case 2:
                System.out.println("星期一");
                break;
            case 3:
                System.out.println("星期二");
                break;
            case 4:
                System.out.println("星期三");
                break;
            case 5:
                System.out.println("星期四");
                break;
            case 6:
                System.out.println("星期五");
                break;
            default:
                System.out.println("星期六");
                break;
        }
    }
}
