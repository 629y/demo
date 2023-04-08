package cn.practice;

public class Switch3 {
    public static void main(String[] args) {
        int year=2008;
        int month=2;
        int days=switch (month){
            case 1,3,5,7,8,10,12 ->31;
            case 4,6,9,11 -> 30;
            case 2 -> year%400==0||year%4==0&&year%100!=0?29:28;
            default -> 31;
        };
        System.out.printf("%d年%d月有%d天%n",year,month,days);
    }
}
