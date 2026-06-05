package Assignment5;

public class SchoolStudent extends Student {

    private String classname;

    public SchoolStudent() {}

    public SchoolStudent(int rn, double per, String classname) {
        super(rn, per);
        this.classname = classname;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Class : " + classname);
    }
}