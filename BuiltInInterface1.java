//Program to illustrate simple predicate
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
public class BuiltInInterface1 {

	public static void main(String[] args) {
		/*Predicate <String> isLongString = new Predicate <String>() {
			@Override
			public boolean test(String s) {
				return s.length()>3;
			}
		};
		
		String s  = "Understood";
		boolean r = isLongString.equals(s);
		System.out.println(r);
		Predicate<String> isLongString = s ->s.length()>3;
		String s ="Success";
		boolean r =isLongString.test(s);
		System.out.println(r);*/
		
		Predicate<String> pf = (s) ->s.length()>10; // Lambda expression
		Predicate<String> pf2 = (s) ->s.startsWith("S");
		
		System.out.println(pf.test("Hello"));
		System.out.println(pf.test("Successfully"));
		System.out.println(pf2.test("Understood"));
		System.out.println(pf2.test("Sorthengshire"));
		
		List<String> l1 =new ArrayList <String>();
		Collections.addAll(l1, "Greatfulness","Usefulness","Succesfuly","Politeness","Soul");
		l1.stream().filter(pf2).forEach(System.out::println);
		l1.stream().filter(pf).forEach(System.out::println);


	}

}
