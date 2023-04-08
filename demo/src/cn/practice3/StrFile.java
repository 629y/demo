package cn.practice3;

import java.io.File;

public class StrFile {
    public static void main(String[] args) {
        //Linux
        String path = "c:\\users\\oa\\goods\\imag\\xxsf24.jpg";

        //window
        path = "c:/users/oa/goods/imag/xxsf24.jpg";

        //trim() 清楚左边 右边连接空格
        System.out.println("        hello    world     ".trim());//hello    world

        //replace() 是查找替换方法，查找空格，替换为"" 功能是清除所有的空格
        System.out.println("        hello    world     ".replace(" ",""));//helloworld

        //字符串截取操作
        System.out.println("hello, java17".substring(6));// java17

        String path1 = "c:/users/oa/goods/imag/xxsf24.jpg";

        //取出文件类型 jpg
        String ext = path1.substring(path1.lastIndexOf(".")+1);
        System.out.println(ext);//jpg

        System.out.println(System.getProperty("os.name"));//Windows 10
        //取出文件名 xxsf24.jpg
        String name = path1.substring(path1.lastIndexOf("/")+1);
        System.out.println(name);//xxsf24.jpg

        //File.separator linux 返回 / windows \\
        String name1 = File.separator.equals("/")?path.substring(path.lastIndexOf("/")+1):path.substring(path.lastIndexOf("\\")+1);
        System.out.println(name1);//c:/users/oa/goods/imag/xxsf24.jpg

        //取出文件路径 c:/users/oa/goods/imag
    }
}
