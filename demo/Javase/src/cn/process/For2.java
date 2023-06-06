package cn.process;
/**
 * <p>Description: for (;i<10;)</p>
 * <p>Class:For2</p>
 * <p>Powered by zxy On 2023-04-11 18:22  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class For2 {
    public static void main(String[] args) {
        int i =1;
        for (;i<10;){
            System.out.printf("%d ",i++);//1 2 3 4 5 6 7 8 9
        }
        System.out.println();
        System.out.println(i);//10
        System.out.println("\r\n"+i);//换行输出
    }
}
