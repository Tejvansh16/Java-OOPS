import java.util.Scanner;

class Student{
	private String name;
	private int Id;
	private float GPA;
	Scanner sc = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public float getGPA() {
		return GPA;
	}
	public int getId() {
		return Id;
	}
	 public void setName(String name) {
		 this.name=name;
	 }
	 public void setId(int Id) {
		 this.Id=Id;
	 }
	 public void setGPA(float GPA) {
		 this.GPA=GPA;
	 }
	 public String toString(){ 
		 return Id+" "+name+" "+GPA;
		 }
}
class Undergrad extends Student{
	private int year;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public String toString(){ 
		 return "Student belongs to year "+year;
		 }
}
class Graduate extends Student{
	private String thesisTitle;
	public String getThesisTitle() {
		return thesisTitle;
	}
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle=thesisTitle;
	}
	public String toString(){ 
		 return "Title of the thesis is "+thesisTitle;
		 }
}
public class LabExp5 {

	public static void main(String[] args) {
		Student S1=new Student();
		Undergrad S2 =new Undergrad();
		Graduate S3=new Graduate();
		S1.setName("Tejvansh");
		S1.setId(1234);
		S1.setGPA(9.0f);
		S1.getName();
		S1.getId();
		S1.getGPA();
		System.out.println("For S1 "+S1.toString());
		S2.setYear(2021);
		S2.getYear();
		System.out.println("For S2 "+S2.toString());
		S3.setThesisTitle("AR");
		S3.getThesisTitle();
		System.out.println("For S3 "+S3.toString());
		
	}

}
