/*
	abstract void area();
	double pi=3.141;
	
	class CircleG extends ShapeG{
		double r;
		@Override
		void area() {
			System.out.println("Circle area = "+(pi*r*r));
		}
		CircleG(double r){
			this.r=r;
		}
	}
	class SquareG extends ShapeG{
		double s;
		@Override
		void area() {
			System.out.println("Square area ="+(s*s));
		}
		SquareG(double s){
			this.s=s;
		}
		
	}
}
public class NestedTopC {

	public static void main(String[] args) {
		ShapeG.CircleG cg=new CircleG(3);
		
		cg.area();
		ShapeG.CircleG sg=new SquareG(2);
		sg.area();

	}

}
*/