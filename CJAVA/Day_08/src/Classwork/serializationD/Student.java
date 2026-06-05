package Classwork.serializationD;

import java.io.Serializable;

public class Student implements Serializable {

    private int rollNo;
    private String name;

    public Student() {}

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }
}