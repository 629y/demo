package cn.practice1;

import java.util.Arrays;
/**
 * <p>Description:遍历数组</p>
 * <p>Class:Array2</p>
 * <p>Powered by zxy On 2023-04-13 01:34  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Array2 {
    public static void main(String[] args) {
        //遍历数组
        var ss = "java,html,css,javascript,mysql,vue,python".split(",");
        System.out.println(ss.length);//7
        System.out.println(ss);//[Ljava.lang.String;@41629346
        System.out.println(Arrays.toString(ss));//[java, html, css, javascript, mysql, vue, python]

        System.out.println(ss[4]);//mysql

        int index = 0;
        for (String s:ss){
            System.out.println(ss[index++]);
            //java
            //html
            //css
            //javascript
            //mysql
            //vue
            //python
        }
        for (int i = 0;i<ss.length;i++){
            System.out.printf("ss[%d] = %s%n",i,ss[i]);
            //ss[0] = java
            //ss[1] = html
            //ss[2] = css
            //ss[3] = javascript
            //ss[4] = mysql
            //ss[5] = vue
            //ss[6] = python
        }
        for (int i = ss.length - 1;i>=0;i--){
            System.out.printf("ss[%d] = %s%n",i,ss[i]);
            //ss[6] = python
            //ss[5] = vue
            //ss[4] = mysql
            //ss[3] = javascript
            //ss[2] = css
            //ss[1] = html
            //ss[0] = java
        }
    }
}
