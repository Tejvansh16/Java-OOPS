import java.util.Scanner;
interface Greeting{
	String greet();
}
public class Lambda5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		String userName=sc.next();
		Greeting g=()->{
			return ("Hello "+userName); 
		};
		System.out.println(g.greet());
		sc.close();

	}

}
