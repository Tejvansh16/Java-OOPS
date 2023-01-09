interface StringConcat{
	String sconcat(String a, String b);
}
public class Lambda4 {

	public static void main(String[] args) {
		StringConcat s=(str1,str2)->str1+str2;
		System.out.println("Result:"+s.sconcat("Hello ","user"));

	}

}
