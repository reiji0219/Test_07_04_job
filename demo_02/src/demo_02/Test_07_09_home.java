package demo_02;

import umejava_05_01.Interface;

public class Test_07_09_home
{
	public static void main( String[] args )
	{
		Calc09 calc = new Calc09( "Poly-morphism" );
			calc.process( () -> {
				System.out.println( "関心事を記述" );
				
				Interface save = Calc09.create();
					save.execute();
			});
			
		
		
		
	}
	
	
}
