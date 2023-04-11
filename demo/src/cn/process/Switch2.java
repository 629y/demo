package cn.process;
/**
 * <p>Description:switch语句及表达式使用，根据指定的年月计算输出该月有多少天？</p>
 * <p>Class:Switch2</p>
 * <p>Powered by zxy On 2023-04-11 18:10  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Switch2 {
    public static void main(String[] args) {
        int year=2023;
        int month = 4;
        int days=31;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;
            default:
                days=year%400==0||year%4==0&&year%100!=0?29:28;
                break;
        }
        System.out.printf("%d年%d月有%d天%n",year,month,days);
    }
}
