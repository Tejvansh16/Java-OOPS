//It's an example of arraylist under collection framework
import java.util.*;//this package provides state of art technology for managing group of objects
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> arl1=new ArrayList<String>();
		System.out.println(arl1.size());
		arl1.add("Ele-1");
		arl1.add("Ele-2");
		System.out.println(arl1);
		System.out.println(arl1.size());
		
		arl1.add(0,"AnyElement");
		System.out.println(arl1);
		System.out.println(arl1.size());
		
		arl1.remove(2);
		System.out.println(arl1);
		System.out.println(arl1.size());
		
		ArrayList<String> arl2=new ArrayList<String>();
		arl2=(ArrayList<String>)arl1.clone();
		
		System.out.println("I am ArrayList2 "+arl2);
		arl1.add("Ele-2");
		System.out.println("I am ArrayList1 "+arl1);

	}

}
