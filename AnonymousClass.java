interface animal{
    void bark();
}
/*
 * class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

class AnonymosClass{
    public static void main(String[] args) {
        Dog Bruno = new Dog();
        Bruno.bark();
          }
}
 */
//instead of creating a seperate class "Dog".
//we can create an anonymous class by referencing interface Animal
public class AnonymousClass {

	public static void main(String[] args) {
		 animal Bruno = new animal() {
	            
	            public void bark() {
	                System.out.println("Dog barks!");
	            }
	        };
	        Bruno.bark();

	}

}
