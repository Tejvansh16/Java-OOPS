//Creating an anonymous class by implementing an interface
interface Human{
    void walk();
}
public class AnonymousClass2 {

	public static void main(String[] args) {
		Human John = new Human() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        John.walk();
	}

}
