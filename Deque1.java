import java.util.*;
public class Deque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer>ad=new ArrayDeque<Integer>();
		Deque<String>ndeque=new ArrayDeque<>();//
		
		Deque<String>ldeque=new LinkedList<>();//create linkedlist object from deque
		ArrayDeque<String>ard=new ArrayDeque<String>();
		ard.addFirst("argon");
		ard.add("xenon");
		ard.add("neon");
		ard.offerLast("helium");
		ard.addLast("neon");
		
		ArrayDeque<String>ard_clone=new ArrayDeque<String>(ard);
		System.out.println(ard_clone);
		
		ArrayDeque<String> ard1=new ArrayDeque<String>();
		ard1.add("argon");
		ard1.add("xenon");
		ard1.add("neon");
		ard1.offerLast("helium");
		ard1.addLast("hydrogen");
		if(ard.element().equals(ard1.element())) {
			System.out.println("Hi");
		}

	}

}
