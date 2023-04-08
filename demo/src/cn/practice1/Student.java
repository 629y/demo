package cn.practice1;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int score;
    private  String address;
    public Student(){
    }

    public String toString(){
        return "Student{"+"id=" + id + ", name='" + name + '\'' + ", score=" + score + ", address='" + address + '\'' + '}';
    }
    // alt + insert 快速编写代码，alt + insert 快速插入代码 getter setter 构造器 toString()
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id, String name, int score, String address){
        this.id = id;
        this.name = name;
        this.score = score;
        this.address = address;
    }


    public int compareTo(Student o) {
        //return id - o.id;
        return address.compareTo(o.address);
    }
}
