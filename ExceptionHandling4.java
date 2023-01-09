import java.lang.Exception;
class DivideByZero extends ArithmeticException{
	public DivideByZero(String message) {
		super(message);
	}
}

public class ExceptionHandling4 {

	public static void main(String[] args) {
		try {
			double x=5,y=0;
			double z=x/y;
			throw new ArithmeticException("New Arithmetic Exception");
		}
		catch(DivideByZero e) {
			System.err.print(e);
			System.out.println(e.getMessage());
		}

	}

}

