import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
abstract class Game implements Comparable<Game>{
	Integer game_id;
	Game(int game_id){
		this.game_id=game_id;
	}
}

public class StreamOps {

	public static void main(String[] args) {
		
		// Create a stream and sort
		Stream<Integer> stream = Stream.of(new Integer[] {10,58,9,63,25,2,1,91});
		//stream.forEach(p -> System.out.println(" "+p+9));
		
		// Create a list and sort
		List <String> names = new ArrayList <String>();
		names.add("Hello");
		names.add("vansh");
		names.add("mehar");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);

	}

}
