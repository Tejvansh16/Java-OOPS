import java.util.Scanner;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a ");
		a=sc.nextInt();
		System.out.println("Enter value of b ");
		b=sc.nextInt();
		try {
			b=0;
			int res=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("b is 0");
		}
		finally {
			System.out.println("This will be executed besides exceptions");
		}
		System.out.println("This will run if exceptions are handled properly");

	}

}
