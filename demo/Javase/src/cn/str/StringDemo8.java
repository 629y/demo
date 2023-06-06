/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.str;

/**
 * <p>Description:定义一个方法，实现字符串反转
 * 键盘录入一个字符串，调用该方法后，在控制台输出结果
 * 例如，键盘录入abc,输出cba</p>
 * <p>Class:</p>
 * <p>Powered by zxy On 2023/6/6 21:49 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class StringDemo8 {
    public static void main(String[] args) {
        String result = reverser("abc");
        System.out.println(result);
    }
    //1.我要干嘛？  ---字符串的反转
    //2.我干这件事情需要什么才能完成？  ---需要一个字符串
    //3.我干完了是否要把结果返回给调用处 ---需要结果进行输出
    public static String reverser(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            // i 依次表示字符串中的每一个索引（倒着的）
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
