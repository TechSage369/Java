/*Write a program that takes your full name as input and displays the 
abbreviations of the first and middle names except the last name 
which is displayed as it is. For example, if your name is Robert Brett 
Roser, then the output should be R.B.Roser*/
import java.util.*;


 class Separator{
	private String lastName="";
	private String finalName="";
	private int nameLength,i;

			protected String Abbreviate(String name){
					nameLength= name.length();
					finalName+=name.charAt(0)+".";

					//to get Abbreviative name
					for(i=0;i<nameLength;i++){
						if(name.charAt(i)==' ' && name.charAt(i+1)!=' ' && (i+1)<nameLength ){
							finalName=(finalName+name.charAt(i+1)).toUpperCase();
							finalName = finalName+".";
						}
					}
					
					//to get last name
					for(i=nameLength-1;i>=0;i--){
						if(name.charAt(i)==' '){ 
			 				lastName=name.substring(i+2).toLowerCase();
			 				break;
					}
				}
				//Adding Abbreviative name with last name
				finalName= finalName.substring(0,finalName.length()-1);
				finalName+=lastName;
				return finalName;
			}

}

public class AbbreviativeName{
	public  static void main(String []args){
		String enteredName,output;
		Scanner in= new Scanner(System.in);
		Separator details = new Separator();
		
		System.out.print("Name: ");
		enteredName=in.nextLine();

		output=details.Abbreviate(enteredName); //Calling userdefined method
		System.out.println("\n\nAbbreviative Name: "+output);

	}
}