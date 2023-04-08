package cn.practice2;

public class HashCode {
    public static void main(String[] args) {
        System.out.println("Ma".hashCode());//2484
        System.out.println("NB".hashCode());//2484
        String s1 = new String("Ma");
        String s2 = new String("NB");
        System.out.println(s1.hashCode()); //2484
        System.out.println(s2.hashCode()); //2484
    }
}
