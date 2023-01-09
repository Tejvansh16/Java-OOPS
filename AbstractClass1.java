abstract class figure{
	double dim1,dim2;
	figure(double a, double b){
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class SQUARE extends figure{
	SQUARE(double a,double b){
		super (a,b);
	}
	double area() {
		//System.out.println("Inside area of square");
		return dim1*dim2;
	}
}
class TRIANGLE extends figure{
	TRIANGLE(double a,double b){
		super (a,b);
	}
	double area() {
		//System.out.println("Inside area of square");
		return dim1*dim2/2;
	}
}
public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQUARE s=new SQUARE(10.0,10.0);
		System.out.println(s.area());
		TRIANGLE t=new TRIANGLE(15.0,10.0);
		System.out.println(t.area());
	}

}
