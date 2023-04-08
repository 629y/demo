package cn.practice1;

public class AccessModifier {
    /*属性 成员变量*/
    public int id; //全局
    private final int num = 18;//私有
    protected String addr = "郑州";//受保护
    String name = "jack";//友好,默认

    /* 静态属性 类变量 */
    public static int id1 = 3;
    //静态 static 只分配一次内存

    /*常量 不能修改只能使用*/
    public final int AGE = 18;

    public/*访问修饰权限*/ static/*静态方法，当前方法不用实例化对象，可以通过类型直接使用此方法*/ void/*没有返回值*/ print/*方法名*/(/* 形参列表*/) {
            //方法体
            //return; 代表结束当前方法执行
    }

    public static void main(String[] args) {

    }
}
