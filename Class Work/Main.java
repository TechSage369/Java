/*Create a person inhetit two classes from it politician & sportsman provide constructor & calculate salary & display functions.*/

// Super class
class Person{
	int politicianSalary = 90000;
	int sportManSalary = 60000;
	String politicianFunction= "Support and create laws that govern the land and, by extension, its people.";
	String sportManFunction = "takes part in sports";

}
// Sub-class
class Politician extends Person{ 

	protected void details(){ /*user defined method*/
		System.out.print("\nPolitician: \n"+ politicianFunction);
		System.out.println("\nSalary: Rs-" + politicianSalary);
	}

}
// sub-class
class SportsMan extends Person{

	protected void details(){
		System.out.print("\nSportsman: \n"+ sportManFunction);
		System.out.println("\nSalary: Rs-" + sportManSalary);
	}
}

public class Main {

	public static void main(String []args){
		Politician object1 = new Politician(); //Creating an object
		SportsMan  object2 = new SportsMan();  //Creating an object
		 object1.details(); //Calling  method
		 object2.details(); //Calling  method
	}
}