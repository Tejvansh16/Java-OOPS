import java.util.Scanner;
class BankAcc{
	private int acno;
	private int bal;
	Scanner get =new Scanner (System.in);
	BankAcc(int x,int y){
		acno=x;
		bal=y;
	}
	void deposit() {
		System.out.println("Enter amount to deposit");
		int amount = get.nextInt();
		bal=bal+amount;
		System.out.println("New Bal = "+bal);
	}
	void withdraw() {
		System.out.println("Enter the amount to withdraw ");
		int amount = get.nextInt();
		if(bal>amount) {
			bal=bal-amount;
			System.out.println("New bal = "+bal);
		}
		else {
			System.out.println("You can't withdraw");
		}
	}
}
public class BANKPROGRAM {

	public static void main(String[] args) {
		BankAcc b1=new BankAcc(1234,5000);
		b1.deposit();
		b1.withdraw();
	}

}
