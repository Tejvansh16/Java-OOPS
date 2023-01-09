import java.util.*;

class Customer{
  private String name;
  private int points;

  Customer(String name, int points){
    this.points = points;
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }

  public int getPoints(){
    return this.points;
  }

  public void setPoints(int points){
    this.points = points;
  }

  boolean get100(){
    return this.points > 100;
  }

  void increase100(){
    if(get100()){
      this.points += 100;
    }
  }

  public String toString(){
    return ("Customer: " + this.name + ", Points: " + this.points);
  }
}
public class CustomGenerics {

	public static void main(String[] args) {
		Customer john = new Customer("John", 78);
	    Customer harry = new Customer("Harry", 102);
	    Customer buoy = new Customer("Buoy", 109);

	   // List<Customer> customers = Array.asList(john,harry,buoy);  // one way to create lists
	    //System.out.println(customers);

	    // filter() is stream() ka if statement
	    // customers.stream().filter(p -> p.getPoints() > 100).forEach(System.out::println);
	    //customers.stream().filter(p -> p.increase100()).forEach(System.out::println); // To show the ouput of the stream and thus consume it
	    //List<Customer> witHigh = customers.stream().filter(p -> p.getPoints() > 100).collect(Collectors.toList()); // To store the output of the stream

	    //System.out.println(witHigh);

	    //customers.stream.map(p->p.get100().filter(p->p.getPoints()).forEach(p->System.out.println(p.toString)));
	    //customers.stream.filter(p->p.get100()).map(p->p.getPoints()+100).forEach(c->System.out.println(c.toString)));

	}

}
