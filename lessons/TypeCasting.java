public class TypeCasting{


	public static void main(String[] args){
   /*
		Widening casting is done automatically when passing a smaller size type to a larger size type.
		Narrowing casting must be done manually by placing the type in parentheses in front of the value
   */
//________________________________________________________________________________________________________________
		// Automatic type castig
		int x = 234;
		double y= x;
		System.out.println("automatic type casting "+ y);

		// Manual type casting
		int a=12;
		short b= (short)a;
		System.out.println("Manual type casting "+b);
	}
}