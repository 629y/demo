package cn.practice3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class StrFileQuestion {
    public static void main(String[] args) {
        //File f = new File("d:/download/spring.jpg");
        //System.out.println(f.getAbsolutePath());
        //System.out.println(File.separator);

        //String p = "d:\\xxx\\user\\user_abc.jpg";
        //System.out.println(p);
        //String fc = File.separator; // \
        //System.out.println(fc);
        //fc = p.indexOf(fc) == -1 ? "/" : fc;
        //System.out.println(fc);
        //
        //System.out.println("hello".substring(0,2));


        String p = "d:/xxx/user/user_abc.jpg";
        System.out.println(p);
        //File.separator 是根据系统返回相关的符号 linux / windows \ \\
        String fc = File.separator; // \
        fc = p.indexOf(fc) == -1 ? "/" : fc;
        System.out.println(fc);
        String path = p.substring(0, p.lastIndexOf(fc)).concat(fc);
        System.out.println(path);
        String name = p.substring(p.lastIndexOf(fc) + 1);
        System.out.println(name);
        String ext = name.lastIndexOf(".") == -1 ? "" : name.substring(name.lastIndexOf(".") + 1);
        System.out.println(ext);
        UUID uuid = UUID.randomUUID();
        String newp = String.format("%s%s.%s", path, uuid, ext);
        System.out.println(newp);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssS");

        Random rand = new Random();
        String num4 = String.format("%05d",rand.nextInt(99999));
        System.out.println(num4);
        System.out.printf("%s%s-%s.%s",path,sdf.format(new Date()),num4,ext);

    }
}
