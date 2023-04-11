package cn.process;
/**
 * <p>Description:for 计数循环语句</p>
 * <p>Class:For1</p>
 * <p>Powered by zxy On 2023-04-11 18:16  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class For1 {
    public static void main(String[] args) {
        //计算1+2+3+...+100=?
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.printf("1+2+3+...+100=%d%n",sum);

        //计算1+2+3+...+100=?
        System.out.println(101*50);
        //数学家总结的公式

        //计算1+2+3+...+100=?(不能使用循环语句、递归方法，不能直接写结果)

        //死循环
        /*for (;;){
            System.out.println("ok");
        }*/

        //死循环
        //for (;;);

        //for (循环变量的初始化;循环条件;增量){}
        //循环语句结束是循环条件为假时结束，或者在循环体中的语句有break执行
        for (int i=1;i<=5;i++){
            System.out.printf("%d ",i);
        }
        System.out.println();
        for (int i=5;i>=1;--i){
            System.out.printf("%d ",i);
        }
    }
}
