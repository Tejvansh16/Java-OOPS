import java.util.function.*;
interface MyInterface1{
	String sayHello();
}
public class Lambda2 {

	public static void main(String[] args) {
		MyInterface1 msg=()->{
			return "Hello Everyone !!!!!";
		};
		String s = msg.sayHello();
		System.out.println(msg.sayHello());
		System.out.println(msg.sayHello());
		System.out.println(s);

	}

}
