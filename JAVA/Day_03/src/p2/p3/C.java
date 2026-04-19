package p2.p3;
import p1.A;
//import p1.*;

public class C extends A{
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.getA());
		System.out.println(a.n);
		
		C c =new C();
		System.out.println(C.n);
	}
}
