public class ParametersInMethod{
	//Method to print age and name without retun value using void
	static void myMethod(String name,byte age){
		System.out.println("My name is "+name+" and I\'am "+age+" yrs old.");
	}
	// Method to add two numbers with return types
	static int sum(int x, int y){
		return (x+y);
	}

	public static void main(String[] args){
		myMethod("Nishchal",(byte)18);
		System.out.println("Sum of 10 and 20 is: "+sum(10,20));
	}
}