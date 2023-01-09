abstract class AA{
	abstract void callme();
	void callmetoo() {
		System.out.println("This is concrete method callmetoo ");
	}
}
class BB extends AA{
	void callme(){
		System.out.println("This is abstract method call me");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b= new BB();
		b.callme();
		b.callmetoo();

	}

}
