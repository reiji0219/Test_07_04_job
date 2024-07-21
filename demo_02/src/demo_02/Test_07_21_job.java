package demo_02;

import umejava_05_01.Interface;

public class Test_07_21_job 
{
	public static void main( String[] args )
	{
		Calc21 calc = new Calc21( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述する" );	

			Interface save = Calc21.create();
				save.execute();

		});
	}
}
