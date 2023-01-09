import java.util.Scanner;

/**
 * 
 */

/**
 * @author GURMEHAR
 *
 */
public class Control1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello this is a control statement program");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		if(z==9)
		{
			System.out.println("OK");
		}
		
		else
		{
			System.out.println("Enter correct int");
		}

		sc.close();
	}

}
