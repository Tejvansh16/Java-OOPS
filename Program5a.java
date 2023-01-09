import java.util.Scanner;

/**
 * 
 */

/**
 * @author GURMEHAR
 *
 */
public class Program5a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a program to find the greatest amongst 3 numbers");
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Enter first number 'a':");
		a = sc.nextInt();
		System.out.println("Enter second number 'b':");
		b = sc.nextInt();
		System.out.println("Enter third number 'c':");
		c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("'a' is the greatest number");
		}
		else if(b>a && b>c)
		{
			System.out.println("'b' is the greatest number");
		}
		else
		{
			System.out.println("'c' is the greatest number");
		}
		sc.close();

	}

}
