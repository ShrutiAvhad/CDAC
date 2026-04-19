package Classwork.serializationD;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestS {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		
		Student student = new Student(1,"Shruti");
		oos.writeObject(student);
		System.out.println("Success");
		oos.close();
		fos.close();
	}
}
