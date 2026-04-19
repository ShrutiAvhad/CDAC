package classwork;

import java.util.Comparator;

public class MyComparator implements Comparator<Emp> {
	
	@Override
	public int compare(Emp e1, Emp e2) {
		
		if(e1.getEmpId() < e2.getEmpId())
			return +1;
		else if(e1.getEmpId() > e2.getEmpId())
			return -1;
		else
			return 0;
	}


}
