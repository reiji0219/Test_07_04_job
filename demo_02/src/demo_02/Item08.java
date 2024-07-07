package demo_02;

public class Item08 
{
	private String id;
	private String name;
	private double price;
	private double tax;
	
	public Item08( String id, String name, double price, double tax ) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	
	
	@Override
	public String toString() {
		return( "Item08 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax);
	}
	
	
	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
