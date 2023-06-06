package cn.practice2;

public class PtgComponent {
    private int id;
    private String name;
    public PtgComponent() {
    }

    public PtgComponent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "PtgComponent{id = " + id + ", name = " + name + "}";
    }
}
