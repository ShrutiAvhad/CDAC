
public class XYZ {
	public static void main(String[] args) {
		int x = 1;
		int y;
		int z;
		
		y =  x++ + ++x;
		System.out.println(y);
		
		z = x++ - --y - --x + x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
//		z = x && y || !(x||y);
//		System.out.println(z);

	}
}
