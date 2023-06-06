package cn.process;

import java.util.Calendar;
/**
 * <p>Description:if编写分时问候程序</p>
 * <p>Class:If1</p>
 * <p>Powered by zxy On 2023-04-11 15:44  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class If1 {
    public static void main(String[] args) {
        //if else  else if
        //分支语句 if()语句;if(){语句1;语句2;...};if(){}else{};if(){}else if(){}else if(){}else{}
        int i = 5;
        if(i>6){System.out.println("ok");}
        //不规范

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
