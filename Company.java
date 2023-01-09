//Inheritance sub-classing implementation
//Overriding example
class Employee{
	private String en;
	private String eid;
	private double salary;
	public Employee(String en,String eid,double salary) {
		this.en=en;
		this.eid=eid;
		this.salary=salary;
	}
	public void setName(String en) {
		this.en=en;
	}
	String getName() {
		return en;
	}
	public void setEid(String eid) {
		this.eid=eid;
	}
	String getEid() {
		return eid;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	double getSalary() {
		return salary;
	}
}
class Manager extends Employee{
	private double bonus;
	Manager(String en,String eid,double salary,double bonus){
		super(en,eid,salary);
		this.bonus=bonus;
	}
	public void setBonus(double bonus) {
		this.bonus=bonus;
	}
	public double getBonus() {
		return bonus;
	}
	@Override
	double getSalary() {
		return super.getSalary()+bonus;
	}
}
public class Company {

	public static void main(String[] args) {
		
		Employee e= new Employee("XYZ","ABC001",500000);
		System.out.println(e.getSalary());
		e=new Manager("Pqr","AVV675",750000,70000);
		System.out.println(e.getSalary());
		Manager boss = new Manager("Anand","ABC89220",1000000.00,7000.00);
		Manager pmgr = new Manager("XUZ","89920",120000,9000);
		double msal = boss.getSalary();
		System.out.println(boss.getSalary());
		boss.setName("XYZ");
		boss.setBonus(2000);
		System.out.println("Bonus to Boss: "+ boss.getBonus());
		Employee[] staff = new Employee[3];
		// Task to use constructors and methods with objects(in array)
		staff[0]=new Employee ("Pqr","AVV675",750000);
		System.out.println(staff[0].getSalary());
		staff[1]=new Employee("Xyz","BBN875",890000);
		
		

	}

}
