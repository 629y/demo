package cn.process;

import javax.swing.*;
import java.util.Scanner;

/**
 * <p>Description:程序输入</p>
 * <p>Class:Scanner</p>
 * <p>Powered by zxy On 2023-04-11 14:00  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Scanner01 {
    public static void main(String[] args) {
        //main入口参数
        String[] a = {"张三"};
        System.out.println("欢迎：" + a[0]);
        //java -Dfile.encoding=utf-8 InputDemo.java jack
        //欢迎：jack
        //java -Dfile.encoding=utf-8 InputDemo.java 李四
        //欢迎：李四
        //System.exit(0);
        //图像窗口输入
        String n = JOptionPane.showInputDialog("请输入姓名");
        System.out.println("欢迎：" + n);
        //输入Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.println();
        //System.out.println("欢迎：" + name);
        System.out.printf("姓名：%s，年龄：%d岁。%n", name, age);
    }
}
