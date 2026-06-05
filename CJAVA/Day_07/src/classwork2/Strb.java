package classwork2;
import java.text.DecimalFormat;
public class Strb {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		sb.append("World");
		System.out.println(sb);
		
		//sb.reverse()
		//sysout(sb)
		
		sb.replace(6, 11, "Java");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("Helloo.............");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		double d = 10.17865;
		System.out.println(String.format("%.2f", d));
		
		DecimalFormat df = new DecimalFormat("0.00");
		String str = df.format(d);
		System.out.println(str);
		
	}	
}
