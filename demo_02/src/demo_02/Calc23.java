package demo_02;

import umejava_05_01.Interface;

public class Calc23 extends Item23
{
	private String name;
	
	public Calc23( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc23 calc = new Calc23( "Ploy-morphism" );
			
			Item23.save( item -> {
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
	}
	
	@Override
	public void display() {
		indi( name );
	}
	
	public void process( Interface inter ) {
		indi( "start" );
		
		inter.execute();
		
		indi( "end" );
	}
	
	
}