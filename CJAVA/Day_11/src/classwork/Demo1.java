package classwork;
import java.io.File;
import java.io.IOException;

public class Demo1 {
	
	 File file;
	 String path;
	  
	 public Demo1()throws IOException {
		 
		 file = new File ("data.txt");
		 if(file.exists())
		 {
			 System.out.println("File already present" + file.getCanonicalPath());
			 System.out.println("File already present" + file.getAbsolutePath());
			 System.out.println("File already present" + file.getPath());

		 }
		 else
		 {
			 System.out.println(file.createNewFile());
		 }
		 if(file.canRead())
		 {
			 System.out.println("Read more");
		 }
		 if(file.canWrite())
		 {
			 System.out.println("Write mode");
		 }
		 if(file.delete())
		 {
			 System.out.println("Delete file");
		 }
	
			
		 System.out.println("File Name : "+ file.getName());
		 
		 System.out.println("Parent Name : "+ file.getParent());
	 }
	 public static void main(String args[]) throws IOException
	 {
		 Demo1 d = new Demo1();
	 }
	 
}
