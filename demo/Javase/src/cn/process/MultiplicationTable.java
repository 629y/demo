package cn.process;
/**
 * <p>Description:打印九九乘法表</p>
 * <p>Class:MultiplicationTable</p>
 * <p>Powered by zxy On 2023-04-11 18:31  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int a=1;a<=9;a++){
            for (int b=1;b<=a;b++){
                if (a==4&&b==3){
                    System.out.printf("%2d*%-2d=%3d ",a,b,a*b);
                    //System.out.printf("%d * %d = %d\t",a,b,a*b);
                } else if (a*b>=10) {
                    System.out.printf("%d*%-2d=%3d ",a,b,a*b);
                } else if (b==2) {
                    System.out.printf("%d*%-2d=%2d ",a,b,a*b);
                }else {
                    System.out.printf("%2d*%-2d=%2d ",a,b,a*b);
                }
            }
            System.out.println();
        }
    }
}
