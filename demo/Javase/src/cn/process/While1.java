package cn.process;
/**
 * <p>Description:while条件循环语句</p>
 * <p>Class:While1</p>
 * <p>Powered by zxy On 2023-04-11 20:29  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class While1 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println(i++);
        }
        --i;
        while(i>=1){
            System.out.printf("%03d\t",i);
            --i;
        }
    }
}
