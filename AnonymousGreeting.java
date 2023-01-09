
public class AnonymousGreeting {

	interface Hello
	{
		public void greet(); //abstract class
	}
	public void myGreetings() 
	{
		class CasualGreeting implements Hello{
			@Override
			public void greet() {
				System.out.println("World");
			}
		}
		CasualGreeting cg=new CasualGreeting();
		cg.greet();
	}
	public static void main(String[] args) {
		AnonymousGreeting ag = new AnonymousGreeting();
		ag.myGreetings();

	}

}
