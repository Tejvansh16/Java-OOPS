/*class Employee1 {
  private String id;
  private double sal;

  Employee1(String id, double sal){
    this.id = id;
    this.sal = sal;
  }
  double getsal(){
    return this.sal;
  }

void setsal(double sal){
  this.sal = sal;
}

  public String toString(){
    return "ID " + id + " Salary " + sal;
  }
}
public class Employee {

	public static void main(String[] args) {
		Employee1[] emp = {new Employee1(Harry,25000),new Employee1(Buoy,23000),new Employee1(Tom,2500)};
	    List<Customer> Employee = Array.asList(emp);

	    Stream.of(emp).filter(p-> p.getsal() > 5000).forEach(p->System.out::println); // To convert array to stream
	    List<Employee1> witHigh = Stream.of(emp).filter(p-> p.getsal() > 5000).collect(Collectors.toList());
	    System.out.println(witHigh);

	    double total = emp.stream().collect(Collectors.summingDouble(Employee1::getsal));
	    System.out.println(total);
	    double avg_sal = emp.stream(collect(Collectors.averagingDouble(Employee1::getsal)));
	    System.out.println("Average Salary :" + avg_sal);

	}

}
*/