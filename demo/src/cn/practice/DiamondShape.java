package cn.practice;

public class DiamondShape {
    public static void main(String[] args) {
        int s=20;
        for (int i=1;i<20;i+=2){
            s--;
            for (int t=s;t>=1;t--){
                System.out.print(" ");
            }
            for (int n=1;n<=i;n++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=17;i>=1;i-=2){
            s++;
            for (int t=s;t>=1;t--){
                System.out.print(" ");
            }
            for (int n=1;n<=i;n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
