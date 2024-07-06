
public class Calc05 extends Item05
{
	private String name;

	public Calc05( String name ){
	super();
	this.name = name;
	}

	public static Interface create(){
	return() -> {
	Calc05 calc = new Calc05( "Poly-morphism" );

	Item05.save( item -> {
		item.id( "掛け算" )
		    .name( "税込み価格" )
		    .price( 980 )
		    .tax( 1.1 )
		    .calc( calc );

		System.out.println( "計算式 :" + item.getId());

		item.display();
	
		item.execute();

		});

	};

	public void display(){
		indi( name );
	}

	public void process( Interface inter ){
		indi( "start" );

		inter.execute();	

		indi( "end" );
	}



  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Item05 implements Interface
{
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc05 calc;


	public Item05 id( String id ){
	this.id = id;
	reutrn this;
	}
	public Item05 name(  String name ){
	this.name = name;
	reutrn this;
	}
	public Item05 price( double price ){
	this.price = price;
	reutrn this;
	}
	public Item05 tax( double tax ){
	this.tax = tax;
	reutrn this;
	}
	public Item05 calc( Calc05 calc ){
	this.calc = calc;
	return this;
	} 

	public static void save( Consumer<Item05> con ){
	Item05 item = new Item05();
	con.accept( item );
	indi( "save :" + item );
	reutrn this;
	}

	public String getId(){
	return id;
	}

	public void display(){
		indi( "表示内容 :" + name );

		double calcInTax = calcTax( price, tax );
		indi( "税込み価格は" + calcInTax + "円です" );

		calc.display();
	}

	public static double calcTax( double price, double tax ){
		return( price * tax );
	}

	public String toString(){
	return( "Item05" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
	}
	public static void indi( String s0 ){
		System.out.println( s0 );

	}
	public void execute(){
	indi( "Lambda" );
	
	ArrayList<String> animals = new ArrayList<>( Arrays.asList( "Dog" ));

	ArrayList<String> animal = new ArrayList<>();
		animal.add( "Cat" );
		animal.add( "Lion" );
		animal.add( "Penguin" );

		animals.addAll( animal );

	String getAnimal = animals.get( 3 );
		indi( getAnimal );

		animals.set( 3, "phoenix" );

		animals.remove( 2 );
		animals.add( 2, "Fox" );

	Comparator<String> compa = new Comparator<>(){
		public int compare( String o1, String o2 ){
			return( o2.compareTo( o1 ));
		}
	};

	Collections.sort( animals );

	Iterator<String> itera = animals.iterator();
	while( itera.hasNext()){
		String hoge = itera.next();
			indi( hoge );


	ArrayList<Integer> seq = new ArrayList<>();

	for( int i = 0; i < 5; i++ ){
		int number = new java.util.Random().nextInt( 4 ) + 1;
			seq.add( number );
	}

	for( int i : seq ){
		char[] base = { ' ', 'A', 'G', 'T', 'C' };
			System.put.print( base[ i ] );
	}
		indi( " " );


	int num = new java.util.Random().nextInt( 10 ) + 1;

	String str = ( ( num % 2 ) == 0 ) ?( ( num % 3 ) == 0 ) ?
			"true/true" : "true/false"
		    :( ( num % 3 ) == 0 ) ?
			"false/true" : "false/false" ;

		indi( num + "は、" + str );


	}

}



public class Jframe
{
	public static void main( String[] args )
	{
	Calc05 calc = new Calc05( "Poly-morphism" );
	calc.process( () -> {
		System.out.println( "関心事を記述" );


	Interface save = Calc05.create();
	save.execute();

	});

	}
}
