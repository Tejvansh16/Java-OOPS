import java.util.*;
public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);  // inserts 5 at the 5th index in l1
        
        System.out.println("Array list before : "+ l1);

        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);
        
        System.out.println("L1 list contains 7 : " + l1.contains(7));
        System.out.println("L1 list contains 4 : " + l1.contains(4));
        
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        
        System.out.println("L1 Array list : "+ l1);
        System.out.println("L2 Array list : " +l2);
        l1.addAll(l2);
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);
        
        // You can add the elements of l2 at the starting of l1 by typing
        l1.addAll(0,l2);
        
        // Indexof() method prints the index of the first occurrence of a particular number. 
        //Returns -1 if the element is not present in the ArrayList.

        System.out.println("L1 Array list : "+ l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
        
        // lastIndexOf() method prints the index of the last occurrence of a particular number.
        
        System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));

        
        
	}

}
