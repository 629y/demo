package cn.practice2;

public class AbstractClassMain {
    public cn.practice2.AbstractClass getAbstractClass() {
        return abstractClass;
    }

    public void setAbstractClass(cn.practice2.AbstractClass abstractClass) {
        this.abstractClass = abstractClass;
    }

    public AbstractClassMain(cn.practice2.AbstractClass abstractClass){
        this.abstractClass = abstractClass;
    }

    private cn.practice2.AbstractClass abstractClass;

    public void connect(cn.practice2.AbstractClass abstractClass){
       abstractClass.connection();
    }

    public static void main(String[] args) {
        AbstractClass d1 = new cn.practice2.AbstractClassMySQL();
        AbstractClassMain dm = new AbstractClassMain(d1);
        //dm.connect(d1);
        dm.connect(new AbstractClassMySQL());
        dm.connect(new AbstractClassOracle());
    }
}
