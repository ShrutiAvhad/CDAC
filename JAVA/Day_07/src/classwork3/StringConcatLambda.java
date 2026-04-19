package classwork3;

public class StringConcatLambda {
	
	public static void main(String[] args) {
		StringConcat s = (x,y) -> {return x.concat(y);};
		System.out.println(s.StrConcat("Infoway", " Kothrud"));
	}
}
