package cn.practice3;

public class Regexp1 {
    public static void main(String[] args) {
        //判断字符串是中文还是英文
//        String str = "中国";
//        String str1 = "hello4mysql";
//        byte[] bs = str.getBytes();

        //1.判断字符串有没有大写字母
        String s1 = "Hello123";

        //不使用正则表达式
        boolean f = false;
        for (char c:s1.toCharArray()){
            if (c>='A'&& c<='Z'){
                f = true;
                break;
            }
        }
        System.out.println(f?"有大写字母":"没有");

        //使用正则表达  .*[A-Z].*    .代表一个任意字符   *代表{0，}    [A-Z]{3}
        System.out.println(s1.matches(".*[A-Z].*")?"有大写字母":"没有");

        //2.判断字符串有没有汉字
        String s2 = "Hello,中programmer";
        System.out.println(s2.matches(".*[\\u4e00-\\u9fa5].*") ? "有汉字" : "没有");

        //3.判断字符串有没有数字 \\d 代表[0-9]
        String s3 = "Hello123";
        System.out.println(s3.matches(".*\\d.*")?"有数字":"没有");

        //4.判断字符串是不是标准的手机号
        String s4 = "13721337351";
        System.out.println(s4.matches("1[358]\\d{9}") ? "是手机号" : "不是手机号");









    }
}
