class A{
	int a;
	float b;
	void show() {
		System.out.println("b in super class: "+b);
	}
}
class B extends A{
	int a;
	float b;
	B(int p,float q){
		a=p;
		super.b=q;
	}
	void show() {
		super.show();
		System.out.println("b in super class: "+super.b);
		System.out.println("a in sub class: "+ a);
	}
}
public class InheritanceLabManual {

	public static void main(String[] args) {
		B subobj = new B(1,5);
		subobj.show();

	}

}
