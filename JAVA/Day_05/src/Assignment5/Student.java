package Assignment5;

public class Student {

    protected int rollNo;
    protected double per;

    public Student() {}

    public Student(int rn, double per) {
        this.rollNo = rn;
        this.per = per;
    }

    public void show() {
        System.out.println("Roll no : " + rollNo +
                           ", Percentage : " + per);
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getPer() {
        return per;
    }
}