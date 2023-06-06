package cn.practice5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args)throws IOException {
        //指定目录下，建立指定的文件
        File file3 = new File("d:\\lal","test.dat");
        FileOutputStream f3 = new FileOutputStream(file3);
        f3.write(97);

        //test可以是个目录，也可能是个文件
        File file2 = new File("d:\\test");
        FileOutputStream f2 = new FileOutputStream(file2);
        f2.write(97);

        //指定的目录下建立文件，如果路径不存在，则建立虚拟file对象
        //中间的目录或者文件不能为空
        File file1 = new File("d:\\lal\\CreatFile1.txt");
        FileOutputStream f1 = new FileOutputStream(file1);
        f1.write(97);

        //在当前项目根目录下建立文件 CreatFile.txt
        File file = new File("CreatFile.txt");
        FileOutputStream f = new FileOutputStream(file);
        f.write(97);
    }
}
