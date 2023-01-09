import java.util.Scanner;
public class LabExp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any five numbers you want between 1-30");
		int Graph[]=new int[6];
		for(int i =1;i<=5;i=i+1) {
			int n =sc.nextInt();
			Graph[i]=n;
		}
		System.out.println("The Graph you'll get is shown below");
		for(int i=1;i<=5;i++) {
			int v=Graph[i];
			for(int j=1;j<=v;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		sc.close();

	}

}
