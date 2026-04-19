package classwork;

import java.util.Arrays;
import java.util.List;

public class Demo6 {

	public static void main(String [] args)
	{
		List<Integer> list = Arrays.asList(10,34,64,27,9,1);

		int sum = 0; 
		
			for ( int x : list) 
			{
			    if (x % 2 == 0) 
			    {
			        System.out.println(x);
			        sum += x * 2;
			    }
			}

			System.out.println("Total Sum = " + sum);
	
	}
}
