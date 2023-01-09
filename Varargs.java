
public class Varargs {
	public static void sum (double ... args) {
		System.out.println("No. of args entered "+args.length);
		double sum=0;
		for(int i=0;i<args.length;i++) {
			sum=sum+args[i];
		}
		System.out.println("sum = "+sum);
	}
	
	public static void multiply(int ... args) {
		System.out.println("No. of args enterd "+args.length);
		int mul=1;
		for(int i=1;i<args.length;i++) {
			mul=mul*args[i];
		}
		System.out.println("mul = "+mul);
	}
	
	public static void main(String args[]) {
		sum(1.2f,2.3f);
		multiply(1,2,3,4,5);
	}

}
