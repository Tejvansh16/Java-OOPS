import java.util.*;
public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        //Insertion at front :-
		//add(), offerFirst() and addFirst() methods are used to insert an element at front of an array deque
		ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println("After adding 2 elements at first");
        System.out.println(ad1);
        //Insertion At End:-
        //addLast() and offerLast() methods are used to insert an element at the end of the array deque
        ad1.addLast(5);
        ad1.offerLast(10);
        System.out.println("After adding 2 elements at last");
        System.out.println(ad1);
        //getFirst() & peekFirst() methods are used to get the first element of the deque array
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        //getLast() or peekLast() methods are used to print the last element of the deque array
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
        //removeFirst() & pollFirst() methods are used to delete an element from the head of the queue
        ad1.pollFirst(); //deletes first element
        ad1.removeFirst(); //deletes first element
        System.out.println(ad1);
        //removeLast() & pollLast() methods are used to delete an element from the tail of the queue
        ad1.pollLast(); //deletes last element
        ad1.removeLast(); //deletes last element
        System.out.println(ad1);
        

	}

}
