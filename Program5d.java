import java.util.Scanner;

/**
 * 
 */

/**
 * @author GURMEHAR
 *
 */
public class Program5d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program to print the countdown starting from the number entered using for loop");
		Scanner num = new Scanner(System.in);
		System.out.println("Enter an integer except 0");
		int i;
		i=num.nextInt();
		for ( int j=i;j>0;j--)
		{
			System.out.println(j);
		}
		num.close();
	}

}
