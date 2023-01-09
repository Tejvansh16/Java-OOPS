import java.util.*;
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		l1.set(2,4);
		System.out.println(l1);

	}

}
