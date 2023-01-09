import java.util.*;

public class VotingSystem {

	public static void main(String[] args) {
		int P1Count=0,P2Count=0,P3Count=0,P4Count=0;
		//Following code is for the admin 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Admin");
		System.out.println("Enter the parties name");
		String PAR[] = new String[5];
		for (int i = 1; i <= 4; i++) {
	            PAR[i]=sc.next();
		}
		System.out.println("Enter the no. of voters who will be voting");
		int VL = sc.nextInt();
		
		//Following code is for the voters
		
		System.out.println("Welcome voters");
		System.out.println("These are the parties who will be contesting");
		for(int i =1;i<=4;i++) {
			System.out.println(i+". "+PAR[i]+"\n");
		}
		
		System.out.println("Voters please enter the correct party number(integer before party name).Otherwise your vote will not be counted");
		
		for(int j=1;j<=VL;j++) {
			System.out.println("Welcome for voting voter "+j);
			/*System.out.println("Enter your name");
			String name=sc.next();
			System.out.println("Enter your registration number");
			int rgno = sc.nextInt();*/
			System.out.println("Enter your age");
			int age = sc.nextInt();
			if (age>0) {
				if(age>=18){
					System.out.println("Enter your choice");
					int ch = sc.nextInt();
					if (ch==1) {
						P1Count=P1Count +1;
					}
					else if (ch==2) {
						P2Count=P2Count +1;
					}
					else if (ch==3) {
						P3Count=P3Count +1;
					}
					else if (ch==4) {
						P4Count=P4Count +1;
					}
					else {
						System.out.println("Voter no. "+j+". enterd invalid party number");
					}


				}else{
					int shortBy = (18 - age);
					System.out.println("Sorry, you can't vote now! You can vote after :"+ shortBy + " years");
				}
			}
			else {
				System.out.println("Please come again after this round ends.Next time enter proper age(integers only");
			}
		}
		/*if((P1Count==P2Count)&&(P2Count==P3Count)&&(P3Count==P4Count)){
			System.out.println("All parties got equal vote");
		}
		else {
			if((P1Count>=P2Count)&&(P1Count==P3Count)&&(P1Count==P4Count)) {
				System.out.println("Party no. 1 won the election");
			}
			else if((P2Count>=P1Count)&&(P2Count==P3Count)&&(P2Count==P4Count)) {
				System.out.println("Party no. 2 won the election");
			}
			else if((P3Count>=P1Count)&&(P3Count==P2Count)&&(P3Count==P4Count)) {
				System.out.println("Party no. 3 won the election");
			}
			else if((P4Count>=P1Count)&&(P4Count==P2Count)&&(P4Count==P3Count)) {
				System.out.println("Party no. 4 won the election");
			}
		}*/
		System.out.println("votes given to party 1: "+P1Count);
		System.out.println("votes given to party 2: "+P2Count);
		System.out.println("votes given to party 3: "+P3Count);
		System.out.println("votes given to party 4: "+P4Count);
		sc.close();

	}

}
