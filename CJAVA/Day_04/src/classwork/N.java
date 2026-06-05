package classwork;

public class N extends M{
	public void m1()
	{
		System.out.println("In Class N");
	}
	
	public static void main(String[] args) {
        M obj = new M();
        obj.m1();
        
        N obj1 = new N();
        obj1.m1();
    }
}
