package cn.practice;

public class Switch2 {
    public static void main(String[] args) {
        int year=2023;
        int month = 2;
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
