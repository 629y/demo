package cn.process;
/**
 * <p>Description:switch语句及表达式使用，根据指定的年月计算输出该月有多少天？</p>
 * <p>Description:switch 表达式必须有default,如果有多行语句，则在{yield返回赋值}</p>
 * <p>Class:Switch3</p>
 * <p>Powered by zxy On 2023-04-11 18:13  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Switch3 {
    public static void main(String[] args) {
        int year=2023;
        int month=4;
        int days=switch (month){
            case 1,3,5,7,8,10,12 ->31;
            case 4,6,9,11 -> 30;
            case 2 -> year%400==0||year%4==0&&year%100!=0?29:28;
            default -> 31;
        };
        System.out.printf("%d年%d月有%d天%n",year,month,days);
    }
}
