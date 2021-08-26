/*Create an abstract class 'Parent' with a method 'message'. It has two 
subclasses each having a method with the same name 'message' that 
prints "This is first subclass" and "This is second subclass" respectively. 
Call the methods 'message' by creating an object for each subclass.
*/
abstract class Parent{
	abstract void message();
}

class First extends Parent{

	public void message(){
		System.out.println("This is first subclass.");
	}
}

class Second extends Parent{
	public void message(){
		System.out.println("This is second subclass.");
	}
}

public class abstractMain{

	public static void main(String []args){
		First myObj1= new First();
	   Second myObj2= new Second();

	   myObj1.message();
	   myObj2.message();
	}
}