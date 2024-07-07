package demo_02;

import umejava_05_01.Interface;

public class Test_07_07_job 
{
	public static void main( String[] args )
	{
		Calc07 calc = new Calc07( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
	
			Interface save = Calc07.create();
			save.execute();
				
			});
	}
}