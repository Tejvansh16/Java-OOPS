//program to implement interface and multiple inheritance
/*interface ANIMAL{
	float speed=20;//static ,final and public
	void sound();
	void speed();
	default void show()
    {
      System.out.println("Animal default method executed");
    }
}
interface FastAnimal{
	void run();
	default void show()
    {
      System.out.println("FastAnimal default method executed");
    }
}
class Tiger implements ANIMAL,FastAnimal{
	public void sound() {
		System.out.println("Roar");
	}
	public void speed() {
		System.out.println("Tiger's speed is 30-50 Km/h");
	}
	public void run() {
		System.out.println("I am a fat animal");
	}
	static void display() {
	    System.out.println("Tiger is a carnivorous animal");
	  }
   public void show() {
		ANIMAL.super.show();
		FastAnimal.super.show();
	}
}
/*class Dog implements Animal,FastAnimal{
	public void sound() {
		System.out.println("Bark");
	}
	public void speed() {
		System.out.println("Dog's speed is 15-25 Km/h");
	}
	
}*/

public class InterfacePrg {

	public static void main(String[] args) {
		/*
		Tiger t1=new Tiger();
		t1.speed();
		t1.run();
		t1.display();
		t1.show();
		t1.sound();*/
	}

}
