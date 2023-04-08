package cn.practice3;

import java.io.File;
import java.util.UUID;

public class StrNewCharacteristic {
    public static void main(String[] args) {
        String p = "d:/xxx/user/user_abc.jpg";
        System.out.println(p);//d:/xxx/user/user_abc.jpg
        //File.separator 是根据系统返回相关的符号 linux / windows \ \\

        String fc = File.separator;
        fc = !p.contains(fc) ? "/" : fc;
        System.out.println(fc);//   /

        String path = p.substring(0, p.lastIndexOf(fc)).concat(fc);
        System.out.println(path);//d:/xxx/user/

        String name = p.substring(p.lastIndexOf(fc) + 1);
        System.out.println(name);//user_abc.jpg

        String ext = name.lastIndexOf(".") == -1 ? "" : name.substring(name.lastIndexOf(".") + 1);
        System.out.println(ext);//jpg

        UUID uuid = UUID.randomUUID();
        String newp = String.format("%s%s.%s", path, uuid, ext);
        System.out.println(newp);//d:/xxx/user/86f2a496-2248-4608-a16c-07d9d3d1cb33.jpg
    }
}
