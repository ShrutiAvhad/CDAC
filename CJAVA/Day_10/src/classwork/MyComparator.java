package classwork;

import java.util.Comparator;

public class MyComparator implements Comparator<EmpDoc> {
	
	@Override
	public int compare(EmpDoc e1, EmpDoc e2) {
		
		if(e1.getEmpId() < e2.getEmpId())
			return +1;
		else if(e1.getEmpId() > e2.getEmpId())
			return -1;
		else
			return 0;
	}


}
