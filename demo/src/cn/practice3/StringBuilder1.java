package cn.practice3;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder su = new StringBuilder();
        su.append("hello");
        su.append(",Java17");
        su.delete(0, 2);
        su.reverse();
        System.out.println(su);
        su.delete(0, su.length());

        su.append("java123");
        su.reverse();
        System.out.println(su);

        //插入  删除  替换  查找  截取 判断
        StringBuilder sbu = new StringBuilder("hello");
        sbu.insert(1, "java");
        //sbu.replace()
        //sbu.indexOf()
        //sbu.substring()
        System.out.println(sbu.toString().contains("java")); //true
        System.out.println(sbu);
    }
    public String get(){
        StringBuilder sbu = new StringBuilder();
        return sbu.toString();
    }
}
