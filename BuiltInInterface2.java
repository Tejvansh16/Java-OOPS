import java.util.*;
import java.util.function.Predicate;
public class BuiltInInterface2 {

	public static void main(String[] args) {
		Predicate<String> t1 = (s) ->s.length()>5;
		Predicate<String> t2 = (s) ->s.endsWith("t");
		
		System.out.println(t1.test("Hello"));
		System.out.println(t1.test("Successfully"));
		System.out.println(t2.test("Guest"));
		System.out.println(t2.test("Waiting"));
		
		List<String> l1 =new ArrayList <String>();
		Collections.addAll(l1,"name","host","amount","Soul");
		System.out.println("For t2 :-");
		l1.stream().filter(t2).forEach(System.out::println);
		System.out.println("For t1 :-");
		l1.stream().filter(t1).forEach(System.out::println);

	}

}
