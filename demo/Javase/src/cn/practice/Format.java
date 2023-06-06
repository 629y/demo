package cn.practice;

public class Format {
    public static void main(String[] args) {
        //+号的用法
        //String str;
        String str = String.format("数字的正负表示：%+d %d %+d %d",8,8,-8,-8);
        System.out.println(str);//数字的正负表示：+8 8 -8 -8
        //-的用法
        str = String.format("左对齐：%-6d",8);
        System.out.println(str);//左对齐：8
        //0的用法
        str = String.format("缺位补零：%06d",8);
        System.out.println(str);//缺位补零：000008
        //' '空格的用法
        str = String.format("缺位补空格：% 6d",8);
        System.out.println(str);//缺位补空格：     8
        str = String.format("缺位补空格：% 6d",-8);
        System.out.println(str);//缺位补空格：    -8
        //,的用法
        str = String.format("数字分组：%,d",123456789);
        System.out.println(str);//数字分组：123,456,789
        //(的用法
        str = String.format("括号用法：%(d",-8888);
        System.out.println(str);//括号用法：(8888)
        str = String.format("括号用法：%(d",8888);
        System.out.println(str);//括号用法：8888
        //#的用法
        str = String.format("#括号用法(十六进制)：%#x",12);
        System.out.println(str);//#括号用法(十六进制)：0xc
        str = String.format("#括号用法(八进制)：%#o",12);
        System.out.println(str);//#括号用法(八进制)：014
        //<的用法
        str = String.format("<括号用法：%f %<3.1f",3.14,3.2);
        //"%<3.1f"作用的对象是前一个"%f"所作用的对象
        System.out.println(str);//<括号用法：3.140000 3.1
    }
}
