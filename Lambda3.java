interface MyInterface2{
	int incrementByFive(int a);
}
public class Lambda3 {

	public static void main(String[] args) {
		MyInterface2 inc = (num)->num+5; 
		System.out.println(inc.incrementByFive(22));
		System.out.println(inc.incrementByFive(90));

	}

}
