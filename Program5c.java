import java.util.Scanner;

public class Program5c {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program to print the countdown starting from th number entered");
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter an integer except 0");
		int i;
		i=SC.nextInt();
		while(i>0)
		{
			System.out.println(i);
			i=i-1;
		}
		SC.close();

	}

}
