import java.util.Scanner;

/**
 * 
 */

/**
 * @author GURMEHAR
 *
 */
public class Program5e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to print the countdown starting from the number entered using do-while loop");
		Scanner NUM = new Scanner(System.in);
		System.out.println("Enter an integer except 0");
		int i;
		i=NUM.nextInt();
		do
		{
			System.out.println(i);
			i=i-1;
		}while(i>0);
		NUM.close();

	}

}
