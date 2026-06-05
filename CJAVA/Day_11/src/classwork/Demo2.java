package classwork;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo2 {
	
	public static void main(String[] args) throws IOException{
		
		RandomAccessFile Raf1 = null;
		RandomAccessFile Raf2 = null;
		
		try 
		{
			File f1 = new File("abc.txt");
			File f2 = new File("mno.txt");
			
			Raf1 = new RandomAccessFile(f1,"r");
			Raf2 = new RandomAccessFile(f2,"rw");
			
			System.out.println(Raf1.getFilePointer());
			Raf1.seek(10);
			
			System.out.println(Raf2.getFilePointer());
			int x = 0;
			
			do
			{
				x = Raf1.read();
				System.out.println(x);
				
				Raf2.write(x);
				
			}while(x != -1);
			System.out.println("Success");
		}
		
		catch(Exception e)
		{
			//e.printStackTrace();
		}
		
		finally
		{
			Raf1.close();
			//Raf2.close();
		}

	}
}
