package learn.java.oop.DesignPattern.StructuralPatterns.DAOPattern;

public class Student {
    private String name;
    private int roolNo;

    public Student(String name, int roolNo) {
        this.name = name;
        this.roolNo = roolNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoolNo() {
        return roolNo;
    }

    public void setRoolNo(int roolNo) {
        this.roolNo = roolNo;
    }
}
