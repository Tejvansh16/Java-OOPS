import java.util.*;
import java.util.stream.*;
public class Stream2 {

	public static void main(String[] args) {
		// Creating a list of integer values
		ArrayList<Integer> mylist = new ArrayList<>();
		mylist.add(1);
		mylist.add(2);
		mylist.add(7);
		mylist.add(5);
		mylist.add(24);
		mylist.add(15);
		System.out.println("List : "+mylist);
		
		//Obtaining a stream for the list
		Stream<Integer> mystream = mylist.stream();
		
		//Obtaining the min value
		Optional <Integer> minVal = mystream.min(Integer:: compare);
		if(minVal.isPresent())
			System.out.println("Minimum value: "+minVal.get());
		//Must call a new stream 
		mystream=mylist.stream();
		//Obtaining the max value
		Optional <Integer> maxVal = mystream.max(Integer:: compare);
		if(maxVal.isPresent())
			System.out.println("Maximum value: "+maxVal.get());
		//sorting the stream
		Stream<Integer> sortedstream=mylist.stream().sorted();
		//Displaying the sorted stream
		System.out.print("Sorted stream: ");
		sortedstream.forEach((n)-> System.out.print(n+" "));
		System.out.println();
		//Displaying the odd values with the help of filter
		Stream<Integer> oddvals=mylist.stream().filter((n)->(n%2)==1);
		System.out.print("Odd values: ");
		oddvals.forEach((n)->System.out.print(n+" "));
		System.out.println();
		//Displaying odd values greater than 5
		oddvals = mylist.stream().filter((n)->(n%2)==1).filter((n)->(n>5));
		System.out.print("Odd values greater than 5: ");
		oddvals.forEach((n)->System.out.print(n+" "));
		System.out.println();
	}

}
