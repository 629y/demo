package cn.practice2;

public class C extends B {

    public C(int i) {
        super(i);
        System.out.println("C....square(int i)");
    }

    static {
        System.out.println("子类B子类C-static{}");
    }

    {
        System.out.println("子类B子类C-init{}");
    }
    public int getY(int i){
        return 0;
    }
}
