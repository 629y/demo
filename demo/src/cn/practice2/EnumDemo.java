package cn.practice2;

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
        System.out.println("--------");
        num n = num.SUCCESS;
        System.out.println(n);//SUCCESS
        System.out.println(n.message);//成功
        System.out.println(n.code);//200
        num err = num.fromCode(404);
        System.out.println(err.message);//未知
        System.out.println(num.valueFrom("ERROR"));//ERROR
        System.out.println(num.valueOf("ERROR"));//ERROR
    }
}
