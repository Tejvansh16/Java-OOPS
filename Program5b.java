import java.util.Scanner;

/**
 * 
 */

/**
 * @author GURMEHAR
 *
 */
public class Program5b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find the state of the entered speed");
		Scanner sc = new Scanner(System.in);
		
		int speed;
		System.out.println("Enter your speed between 1-10 : ");
		speed = sc.nextInt();
		switch (speed)
		{
		case 1 :
			System.out.println("Very slow");
			break;
		case 2 :
			System.out.println("very slow");
			break;
		case 3 :
			System.out.println("slow");
			break;
		case 4 :
			System.out.println("slow");
			break;
		case 5 :
			System.out.println("moderate");
			break;
		case 6 :
			System.out.println("fast");
			break;
		case 7 :
			System.out.println("fast");
			break;
		case 8 :
			System.out.println("very fast");
			break;
		case 9 :
			System.out.println("very fast");
			break;
		case 10 :
			System.out.println("top speed");
			break;
		default :
			System.out.println("You entered wrong input");
		}
		
		sc.close();
			
		

	}

}
