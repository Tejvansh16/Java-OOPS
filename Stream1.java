
import java.util.stream.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Stream1
{
     public static void main(String[] args)
     
     {
    	 //1 we created stream of Int
    	 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
    	 stream.forEach(p -> System.out.println(p*2));   // aggregate operations.
         
    	 //2 we created array of Int and performed stream and operation
        Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
        stream1.forEach(p -> System.out.print(" "+ p+9)); 
                 
         //3 We can create a stream from list elements
         List<Integer> l1 = new ArrayList();
         for (int i =0; i<10; i++) {
        	 l1.add(i);	
         }
           // Collection is Interface and Collections is class 
            //stream is package          and Stream is Interface / Class 
         System.out.println(l1);
         Stream<Integer> stream3 = l1.stream(); //original list
         //stream3.filter(predicate)
         stream3.forEach(p->System.out.println(p*3));    		//intermediate and terminal operations
         System.out.println(l1); //original list
        
         
         //4      
         List<String> students = new ArrayList();
         students.add("Manan");
         students.add("Anubhav");
         students.add("Akash");
         students.add("Anirudh");
         students.add("Juhi");
         // application of intermediate operations and chaining of stream operations.
         students.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
         
         students.stream().filter((s)-> s.startsWith("J")).forEach(System.out::println);
     }
}