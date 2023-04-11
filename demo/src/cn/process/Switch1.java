package cn.process;

import java.util.Calendar;
/**
 * <p>Description:switch多分支开关语句</p>
 * <p>Class:Switch1</p>
 * <p>Powered by zxy On 2023-04-11 16:07  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Switch1 {
    public static void main(String[] args) {
        //switch 多分支开关语句
        //int n = Calendar.getInstance().get(7);
        //1-7 int byte char short String enum

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE,0);

        int n = c.get(Calendar.DAY_OF_WEEK);
        //int n = c.get(7);
        System.out.println(n);

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
