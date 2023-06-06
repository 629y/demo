package cn.practice3;

public class Str {
    public static void main(String[] args) {
        String s1 = "ok";
        String s2 = "ok";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //转义符 \t
        System.out.println("hello\tja\nv\ra");
        System.out.println("hello\tja\r\nva".concat("\b\b"));
        System.out.println("[\bjava,php,python]".concat("\b"));
    }
}
