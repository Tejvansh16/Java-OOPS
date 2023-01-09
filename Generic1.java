import java.util.*;

/*class Student<T>{
	T obj;
	Student(T obj){
		this.obj=obj;
	}
public T getObject() {
	return this.obj;
}
}*/

class Food<T>{
	T obj;
	Food(T obj){
		this.obj=obj;
	}
public T getObject() {
	return this.obj;
}
}
public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food<Integer> iobj=new Food<Integer>(254);
		System.out.println(iobj.getObject());
		Food<String> sobj=new Food<String>("Hello my generic class");
		System.out.println(sobj.getObject());

	}

}
