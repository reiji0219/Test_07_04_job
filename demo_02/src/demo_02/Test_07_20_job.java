package demo_02;

import umejava_05_01.Interface;

public class Test_07_20_job
{
	public static void main( String[] args )
	{
	Calc20 calc = new Calc20( "Poly-morphism" );
	calc.process( () -> {
		System.out.println( "関心事を記述" );
	

		Interface save = Calc20.create();
			save.execute();

		});	

	}
}
