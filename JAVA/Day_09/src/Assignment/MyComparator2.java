package Assignment;

import java.util.Comparator;

public class MyComparator2 implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			
				s1 = s1.toLowerCase();
				s2 = s2.toLowerCase();
				
			if(s1.charAt(0) < s2.charAt(0))
				return +1;
			else if(s1.charAt(0) > s2.charAt(0))
				return -1;
			else
				for(int i=0;i< s1.length(); i++)
				{
					if(s1.charAt(i) > s2.charAt(i))
						return -1;
				}
			return 0;
		}

}


