/* abstract class:-
 * 1.can be inherited
 * 2.cannot make objects
 * 3.can have ABSTRACT and non-abstract methods
 * 4.provides generic way to define subclasses
 * 5.cannot have concrete keywords*/
/*abstract class AB
{
	public final void callme() 
	{
		System.out.println("Hi"); // we cannot change it's body
	}
	abstract void hello();  // abstract method declared
	void showme() 
	{
		System.out.println("I am non abstract method of abstract base class"); //non abstract method
	}
}
// sub class
class Abs extends AB
{
	void hello() 
	{
		System.out.println("I am from Abs");
	}
}
// subclass
class Bb extends AB
{
	void hello()
	{
	System.out.println("I am from Bb");
    }
}
public class AbstractMethods 
{
	public static void main(String[] args) 
	{
		//AB a1=new AB();
		Abs abs = new Abs();
		abs.callme();
		abs.showme();
		abs.hello();
		
		Bb bb = new Bb();
		bb.callme();
		bb.showme();
		bb.hello();
		
		AB a1=new Abs();
		a1.callme();
		a1.showme();
		a1= new Bb();
		a1.hello();
	}
}
*/