package cn.example;

/**
 * <p>Description:利用入口方法String[] args,编写一个求两个数商和余数的案例程序，并运行出结果？</p>
 * <p>Class:division</p>
 * <p>Powered by zxy On 2023-04-10 00:55  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ExampleFirst02 {
    public static void main(String[] args) {
        //使用main入口方法参数实现除法效果

         String[] a = {"12","4"};
        int x=Integer.parseInt(a[0]);
        int y=Integer.parseInt(a[1]);
        if (x%y==0){
            System.out.printf("%d/%d=%d",x,y,x/y);
        }else {
            System.out.printf("%d/%d=%d...%d",x,y,x/y,x%y);
        }
    }
}
