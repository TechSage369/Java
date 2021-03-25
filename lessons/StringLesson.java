public class StringLesson{

	public static void main(String[] args){
		String greeting="Hello Nishchal", lastName="Rai";

		//To print length of a string
		System.out.println("Length of String: "+ greeting.length()+"\n"); /* /r will remove string before it */

		// original string
		System.out.println("\tOriginal String: "+greeting);

		//convert string to upper case
		System.out.println("Converting string to upper case : \b" + greeting.toUpperCase());

		//convert string to lower case
		System.out.println("Converting to lower case: "+greeting.toLowerCase());

		//_________________________________________________________________________________
		//Indexof (to find index position of particular string)

		System.out.println("index postion of Nishchal: "+ greeting.indexOf("Nishchal"));

		//__________________________________________________________________________________

		//string concatination
		System.out.println("concat using + operator: "+greeting + " " + lastName);
		//concatination by concat method
		System.out.println("concat using concat method: "+greeting.concat(lastName));
		
		//_________________________________________________________________________________
		//Special Character "" / '' 
		System.out.println("Hi my name is \"Nishchal Rai\" \\ Using slash ");

	}
}