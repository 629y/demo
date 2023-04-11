package cn.process;
/**
 * <p>Description:break continue label</p>
 * <p>break语句出现在 switch语句，循环语句，代表退出当前的程序执行块 </p>
 * <p>continue 结束本次循环，立即开始下次循环</p>
 * <p>Class:While</p>
 * <p>Powered by zxy On 2023-04-11 20:38 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class WhileBreak {
    public static void main(String[] args) {
        while (true) {
            System.out.println(2);
            //退出终止当前循环语句，执行到循环语句后
            break;
        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
            //结束本次，立即开始下一次循环
                continue;
            }
            System.out.print(i + " ");
            if (i > 10) {
                break;
            }
        }
    }
}
