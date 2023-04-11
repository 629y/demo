package cn.process;
/**
 * <p>Description:do while</p>
 * <p>Class:Dowhile</p>
 * <p>Powered by zxy On 2023-04-11 20:32  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Dowhile {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);//1
            ++i;
            break;
        }while (i<=10);
    }
}
