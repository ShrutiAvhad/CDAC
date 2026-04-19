package classwork2;

public class Str {
	public static void main(String[] args) {
		
		String s1 = "Java";
		System.out.println(s1);
		
//		s1 = s1.concat("Programming");
//		System.out.println(s1);
		
//		String s2 = new String("Infoway");
//		System.out.println(s2);
//		
//		s2.concat("Technology");
//		System.out.println(s2);
//		System.out.println(s1.length());
//		
//		String s3 = "java";
//		String s4 = " Java ";
//		String s5 = "Java";
		
//		System.out.println(s1 == s3);
//		System.out.println(s1 == s4);
//		System.out.println(s3 == s4);
//		System.out.println(s1 == s5);
//		
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s1.compareToIgnoreCase(s3));
//		System.out.println(s1.compareTo(s5));
//		
		System.out.println(s1.charAt(2));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.contains("av"));
	
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("J"));
		
		char arr[] = s1.toCharArray();
		System.out.println(arr[2]); 
		
//		System.out.println(s4.length());
//		System.out.println(s4.trim().length());
		
		System.out.println(s1.substring(0,3));
		System.out.println(s1.endsWith("a"));

	}
}
