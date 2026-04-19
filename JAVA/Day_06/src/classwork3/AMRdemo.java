package classwork3;

import java.io.*;

public class AMRdemo {
	public static void main(String[] args) throws IOException {

		try (FileOutputStream fos = new FileOutputStream("mno.txt",true);
				FileInputStream fis = new FileInputStream("abc.txt")) {
			int i = 0;
			
			while((i = fis.read()) != -1)
			{
				fos.write(i);
			}

		} catch (Exception e) {

		}
	}
}
