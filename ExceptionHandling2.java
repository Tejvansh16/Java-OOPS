import java.io.*;
public class ExceptionHandling2 {

	public static void main(String[] args)throws FileNotFoundException,IOException
	{
		FileInputStream fis = null;
		fis=new FileInputStream("C:\\Users\\GURMEHAR\\Documents");
		int k ;
		while((k=fis.read())!=-1) {
			System.out.print((char) k);
		fis.close();
		}
	}

}
