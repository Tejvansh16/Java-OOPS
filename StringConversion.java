import java.util.Scanner;
public class StringConversion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String lu =sc.next();
	    lu=lu.toLowerCase();
		System.out.println(lu);
	    sc.close();
	}

}
