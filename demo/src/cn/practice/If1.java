package cn.practice;

import java.util.Calendar;

public class If1 {
    public static void main(String[] args) {
        //if else  else if
        //分支语句 if()语句;if(){语句1;语句2;...};if(){}else{};if(){}else if(){}else if(){}else{}
        int i = 5;
        if(i>6)
            System.out.println("ok");//不规范
        if (i>6){
            System.out.println("ok");
        }else {
            System.out.println("no");
        }
        //使用if语句输出上午  下午
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        if(hour >= 12){
            System.out.println("下午");
        }else {
            System.out.println("上午");
        }
    }
}
