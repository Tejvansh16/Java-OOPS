class PurchaseItem{
	private String name;
	private double unitPrice;
	PurchaseItem(String name,double unitPrice){
		this.name=name;
		this.unitPrice=unitPrice; 
	}
	PurchaseItem(){
		this.name="no item ";
		this.unitPrice=0.0;
	}
	public double getPrice() {
		return unitPrice;
	}
	public String toString() {
		return name+" @ "+unitPrice;
	}
}
class WeighedItem extends PurchaseItem{
	private double unitPrice;
	private String name;
	private double weight;
	WeighedItem( String n,double u,double w){
		
		name=n;
		unitPrice=u;
		weight=w;
	}
	public double getPrice() {
		return weight*unitPrice;
	}
	public String toString() {
		return name+" @ unit price "+unitPrice+" for "+weight+" Kg, the cost is "+getPrice()+" Rs";
	}
}
class CountedItem extends PurchaseItem{
	private int quantity;
	private String name;
	private double unitPrice;
	CountedItem( String n,double u,int q){
		
		name=n;
		unitPrice=u;
		quantity=q;
	}
	public double getPrice() {
		return quantity*unitPrice;
	}
	public String toString() {
		return name+" @ unit price"+unitPrice+" for "+quantity+" units, the cost is"+getPrice()+" Rs";
	}
}
public class LabExp6 {

	public static void main(String[] args) {
		WeighedItem A1= new WeighedItem("banana",3.00,2.0);
		System.out.println("For A1 "+A1.toString());
		CountedItem A2= new CountedItem("pens",10.00,10);
		System.out.println("For A2 "+A2.toString());

	}

}
