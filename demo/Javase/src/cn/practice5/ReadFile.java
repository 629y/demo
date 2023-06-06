package cn.practice5;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //读取文件的内容，（文件只能是文本文件ascii文件）
        //什么是文本文件？ .txt .css .js .html .jsp .java
        String book = "D:\\lal\\CreatFile1.txt";
        try(var f = new FileReader(book)){
            while (f.ready()){
                //ready 告诉这个流是否准备好被读取。
                //文件读完循环结束
                System.out.println((char) f.read());
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
