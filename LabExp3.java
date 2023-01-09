import java.util.Scanner;
public class LabExp3 {

	static void rockPaperScissors(String a,String b) {
		if((a=="rock" && b=="scissors")||(a=="paper"&& b=="rock")||(a=="scissors"&& b=="paper")) 
		{
			System.out.println("Player 1 wins!");
		}
		else if((a=="scissors" && b=="rock")||(a=="rock"&& b=="paper")||(a=="paper"&& b=="scissors")) 
		{
			System.out.println("Player 2 wins!");
		}
		else if((a=="rock" && b=="rock")||(a=="paper"&& b=="paper")||(a=="scissors"&& b=="scissors")) 
		{
			System.out.println("TIE!");
		}
		else if((a!="rock"&&b=="scissors")||(a!="rock"&&b=="paper")||(a!="rock"&&b=="rock")
				||(a!="paper"&&b=="scissors")||(a!="paper"&&b=="paper")||(a!="paper"&&b=="rock")||
				(a!="scissors"&&b=="scissors")||(a!="scissors"&&b=="paper")||(a!="scissors"&&b=="rock")) 
		{
			System.out.println("Invalid move of "+a);
		}
		else if((a=="rock"&&b!="scissors")||(a=="rock"&&b!="paper")||(a=="rock"&&b!="rock")
				||(a=="paper"&&b!="scissors")||(a=="paper"&&b!="paper")||(a=="paper"&&b!="rock")||
				(a=="scissors"&&b!="scissors")||(a=="scissors"&&b!="paper")||(a=="scissors"&&b!="rock")) 
		{
			System.out.println("Invalid move of "+b);
		}
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("Rock Paper Scissors!!!!!\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rounds you want to play ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Player 1 enter.It's your turn");
			String A = sc.next();
			A=A.toLowerCase();
			System.out.println("Player 2 enter.It's your turn");
			String B = sc.next();
			B=B.toLowerCase();
			
			rockPaperScissors(A, B);
		}
		sc.close();

	}

}
