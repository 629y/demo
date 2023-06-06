package cn.practice5;

import java.io.File;

public class FileTestDemo {
    public static void main(String[] args) {
        File file = new File("c:\\io.txt");
        //返回文件的长度。
        System.out.println("length==" + file.length());
        //创建文件对象
        File file3 = new File("c:\\io", "code");
        //判断文件或文件夹是否存在
        boolean exists = file3.exists();
        if(exists){
            file3.delete();//存在就删除
        }else{
            file3.mkdirs();//不存在就创建
        }
        //判断该对象是否为一个文件夹。【文件夹必须存在】
        boolean isd = file3.isDirectory();

    }
}
