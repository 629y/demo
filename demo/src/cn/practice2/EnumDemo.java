/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.practice2;

/**
 * <p>Description:</p>
 * <p>Enum:</p>
 * <p>Powered by zxy On 2023/5/22 17:35 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class EnumDemo {
    enum en1 {a, b, c}
    enum color {RED, GREEN, BLUE}
    enum num {
        SUCCESS(200, "成功"), FAIL(400, "失败"), NOTFOUND(404, "未知"), ERROR(300, "错误");
        public int code;
        public String message;

        num(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public static num fromCode(int code) {
            num nn = null;
            for (num v : num.values()) {
                if (v.code == code) {
                    nn = v;
                    break;
                }
            }
            return nn;
        }

        public static num valueFrom(String name) {
            return num.valueOf(name);
        }
    }

    public static void main(String[] args) {
        num n = num.SUCCESS;
        System.out.println(n);
        System.out.println(n.message);
        System.out.println(n.code);

        num err = num.fromCode(404);
        System.out.println(err.message);

        System.out.println(num.valueFrom("ERROR"));
        System.out.println(num.valueOf("ERROR"));
    }
}

