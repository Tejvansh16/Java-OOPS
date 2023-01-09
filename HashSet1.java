import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myhash = new HashSet<String>();
		HashSet<String> set= new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("four");
		
		myhash.add("hello");
		set.remove("one");
		System.out.println(set.size());
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
