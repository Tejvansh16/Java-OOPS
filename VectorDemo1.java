import java.util.*;
public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=3,incr=0;
		String st[]= {"spring roll","pizza","pasta"};
		Vector<String> v1=new Vector<String>();
		Vector<Integer> v2=new Vector<Integer>(size);
		Vector<Double> v3=new Vector<Double>(size,incr);
		v1.add("Hello");
		v1.add("my");
		v1.add("dear");
		System.out.println(v1);
		
		List<String>l1=new Vector<String>(Arrays.asList(st));//we can create a vetor using this method
		System.out.println(l1);
		Vector vd=new Vector();
		vd.add(23);
		vd.add("any string");
		System.out.println(vd);
		System.out.println(v3.capacity());
		v3.add(1.1);
		v3.add(1.2);
		v3.add(1.3);
		System.out.println(v3.capacity());
		v3.add(1.4);
		v3.add(1.5);
		v3.add(1.6);
		System.out.println(v3.capacity());

	}

}
