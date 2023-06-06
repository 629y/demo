package cn.process;
/**
 * <p>Description:label标签，主要出现在循环语句前，主要解决多层嵌套循环语句时 </p>
 * <p>直接break 标签名;continue 标签;进行执行跳转，变相实现了goto语句的作用。</p>
 * <p>Class:LabelBefore</p>
 * <p>Powered by zxy On 2023-04-11 20:51  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class LabelBefore {
    public static void main(String[] args) {
        //label标签 只能现出现循环语句前
        ss:
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%03d%n", i);
            System.out.println("---------------------------");
            while (Math.random() > 0.01) {
                double d = Math.random();
                System.out.println(d);
                if (d > .8) {
                    //直接跑到ss 循环语句结束
                    break ss;
                    //continue ss; //跳转到ss 继续循环
                }
            }
            for (int a = 1; a <= 6; a++) {
                System.out.println(a);
            }
        }
    }
}
