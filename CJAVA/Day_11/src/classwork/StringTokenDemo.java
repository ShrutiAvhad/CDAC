package classwork;
import java.util.StringTokenizer;

public class StringTokenDemo {
	
	public static void main(String [] args)
	{
		String str = "Java = Mayuri ;" + "MySql = Saleel ;";
		StringTokenizer st = new StringTokenizer(str ," =; ");
		
		while(st.hasMoreTokens())
		{
			String c = st.nextToken();
			String nm = st.nextToken();
			System.out.println(c +" "+ nm);
		}
	}
}
