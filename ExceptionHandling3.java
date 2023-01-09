import java.lang.Exception;
import java.lang.System;

class MyException extends Exception{
	public MyException(String Message) {
		super(Message);
	}
}
class MyOwnException extends Exception{
	public MyOwnException(String Message) {
		super(Message);
	}
}

public class ExceptionHandling3 {
	
	public static void main(String[] args) {
		try {
			String custId = null;
			if(custId==null) {
				throw new MyException("Customer Id cannot be null");
				//creating an object of MyExceptin class
			}
		}
		catch (MyException e) {
			System.err.print(e);
		}
		System.out.println("Program ended swiftly");

	}

}
