package cn.practice;

public class DiamondShape1 {
    public static void main(String[] args) {
        int ss = 21;
        int s = ss/2+1;
        for (int i = 1; i <= ss; i+=2) {
            --s;
            for (int m = 1; m <= s; m++) {
                System.out.print("\033[31m \033[0m");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("\033[32m*\033[0m");
            }
            System.out.println();
        }
        for (int i = ss-2; i >= 1; i-=2) {
            ++s;
            for (int m = 1; m <= s; m++) {
                System.out.print("\033[31m \033[0m");
            }
            for (int m=1;m<=i;m++){
                System.out.print("\033[32m*\033[0m");
            }
            System.out.println();
        }
    }
}
