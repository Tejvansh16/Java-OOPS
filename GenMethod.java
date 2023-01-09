
public class GenMethod {

	public static <E> void print(E[] inputArray) 
	{
		for (E element : inputArray) 
		{
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Integer[] intArray= {1,4,6,9};
		print(intArray);
		String[] strArray= {"a","b","c"};
		print(strArray);
	}
}
