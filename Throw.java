class Person{
	static void checkAge(int age) {
		if (age<18) {
			throw new ArithmeticException("Access denied ");
		}
		else {
			System.out.println("Acess granted");
		}
	}
}
public class Throw {

	public static void main(String[] args) {
		try {
			Person.checkAge(16);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("Exception caught");
		}
		finally {
			System.out.println("Closing vault closed");
		}

	}

}
