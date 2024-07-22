package demo_02;

import umejava_05_01.Interface;

public class Test_07_22_job
{
	public static void main( String[] args )
	{
		Calc22 calc = new Calc22( "Ploy-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );


			Interface save = Calc22.create();
				save.execute();
		});
	}
}

