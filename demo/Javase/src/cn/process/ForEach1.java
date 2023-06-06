package cn.process;

import java.util.Set;
/**
 * <p>Description:打印系统的语句</p>
 * <p>Class:ForEach1</p>
 * <p>Powered by zxy On 2023-04-11 20:25  </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class ForEach1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        Set<Object> ks = System.getProperties().keySet();
        for (Object k:ks){
            System.out.println(k+"="+System.getProperty(k.toString()));
        }
    }
}
