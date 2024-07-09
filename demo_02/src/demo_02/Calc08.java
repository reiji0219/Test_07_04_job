package demo_02;

import umejava_05_01.Interface;

public class Calc08 extends Item08
{
	private String name;

	public Calc08( String name ){
	super();
	this.name = name;
	}

	public static Interface create(){
		Calc08 calc = new Calc08( "Poly-morphism" );

		return() -> {
			Item08.save( item -> {
				item.id( "掛け算" )
				    .name( "税込み価格" )
				    .price( 980 )
				    .tax( 1.1 )
				    .calc( calc );

			System.out.println( "計算式 :" + item.getId());

			item.display();

			});

		};
	}

	@Override
	public void display(){
		indi( name );
	}

	public void process( Interface inter ){
		indi( "start" );

		inter.execute();

		indi( "end" );
	}
}

