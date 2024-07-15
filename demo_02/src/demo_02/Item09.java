package demo_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import umejava_05_01.Interface;

public class Item09 implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
		ArrayList<String> animals = new ArrayList<String>( Arrays.asList( "Dog" ));
		
		ArrayList<String> animal = new ArrayList<String>();
			animal.add( "Cat" );
			animal.add( "Lion" );
			animal.add( "Penguin" );
			
			animals.addAll( animal );
			
		String getAnimal = animals.get( 3 );
			indi( getAnimal );
			
			animals.set( 3, "Phoenix" );
			
			animals.remove( 0 );
			animals.add( 0, "Fox" );
			
		Comparator<String> compa = new Comparator<>() {
			public int compare( String o1, String o2 ){
				return( o2.compareTo( o1 ));
			}
		};
			
		Collections.sort( animals, compa );
			
		Iterator<String> itera = animals.iterator();
		while( itera.hasNext()) {
			String hoge = itera.next();
				indi( hoge );
		}
		
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc09 calc;
	
	
	public Item09 id(String id) {
		this.id = id;
		return this;
	}
	public Item09 name(String name) {
		this.name = name;
		return this;
	}
	public Item09 price(double price) {
		this.price = price;
		return this;
	}
	public Item09 tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item09 calc( Calc09 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item09> con ) {
		Item09 item = new Item09();
		con.accept( item );
		indi( "save :" + item );
	}

	public String getId() {
		return id;
	}
	
	public void display() {
		indi( "表示内容 :" + name );
		
		double calcInTax = calcTax( price, tax );
			indi( "税込み価格は" + calcInTax + "円です" );
			
		calc.display();
	}
	public static double calcTax( double price, double tax ) {
		return( price * tax );
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Item09 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
