/*Static vs Non Static*/
public class StaticVsNonStatic{
	// Static method
	static int staticMethod(int x,int y){
		return x+y;
	}

	//Non-Static method
	public int nonStaticMethod(int x,int y){
		return x+y;
	}

	public static void main(String[] args){
		int a=50 , b=75,sum,sum2;
//________________________________________________________________
		// Static method
		//it can be accessed without creating an object of the class
		 sum= staticMethod(a,b);
//________________________________________________________________
		// Non-Static method
		 //it can only be accessed by objects
		 StaticVsNonStatic myObj = new StaticVsNonStatic();
		 sum2=myObj.nonStaticMethod(a,b);
//________________________________________________________________
		System.out.println("Sum using static method: "+sum);
		System.out.println("Sum using non-static method: "+sum2);

	}
}