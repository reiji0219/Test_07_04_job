package demo_02;

import umejava_05_01.Interface;

public class Test_07_23_home 
{
	public static void main( String[] args )
	{
		Calc23 calc = new Calc23( "Ploy-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
		
			Interface save = Calc23.create();
				save.execute();
		
		
		});
	}
}
