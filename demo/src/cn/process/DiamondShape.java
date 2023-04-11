package cn.process;
/**
 * <p>Description:打印菱形图案</p>
 * <p>Class:DiamondShape</p>
 * <p>Powered by zxy On 2023-04-11 19:16  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
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
