package cn.example;

import java.util.Calendar;
/**
 * <p>Description:分时问候</p>
 * <p>Class:Timegreeting</p>
 * <p>Powered by zxy On 2023-04-09 02:23</p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleSecond01 {
    public static void main(String[] args) {
        //编写一个分时问候的程序案例
        var c= Calendar.getInstance();
        var h=c.get(Calendar.HOUR_OF_DAY);
        if(h>=5&&h<8){
            System.out.println("早上好");
        }else if (h>=8&&h<12){
            System.out.println("上午好");
        }else if (h>=12&&h<14){
            System.out.println("中午好");
        }else if (h>=14&&h<18){
            System.out.println("下午好");
        }else{
            System.out.println("晚上好");
        }
    }
}
