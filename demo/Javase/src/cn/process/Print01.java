package cn.process;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * <p>Description:程序输出</p>
 * <p>Class:Pint</p>
 * <p>Powered by zxy On 2023-04-11 15:09  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Print01 {
    public static void main(String[] args) {
        System.out.print(2 * 3);
        System.out.print(2 * 3);
        System.out.println();
        System.out.println(2 * 3);
        System.out.println(2 * 3);
        System.err.println("success");
        JOptionPane.showMessageDialog(null, "hello world", "商城平台",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "hello world", "商城平台",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "hello world", "商城平台",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "hello world", "商城平台",JOptionPane.QUESTION_MESSAGE);
        //信息内容输出到文件中，将字符信息写入文件，（了解，后边io还要学）
        try (var out = new PrintWriter(new FileOutputStream("user.txt"))) {
            out.write("hello world 中文\r\n");
        } catch (Exception e) {

        }
    }
}
