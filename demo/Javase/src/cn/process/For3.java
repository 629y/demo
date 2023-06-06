package cn.process;
/**
 * <p>Description:九九乘法表</p>
 * <p>Class:For3</p>
 * <p>Powered by zxy On 2023-04-11 18:24  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class For3 {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                if (a * b >= 10) {
                    System.out.printf("%d*%-2d=%3d ", a, b, a * b);
                } else if (b >= 2 && b <= 4) {
                    System.out.printf("%d*%-2d=%2d ", a, b, a * b);
                } else {
                    System.out.printf("%2d*%-2d=%2d ", a, b, a * b);
                }
            }
            System.out.println();
        }
    }
}
