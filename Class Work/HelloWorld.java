/* program to find the first and the last occurence of the letter 
'o' and character ',' in "Hello, World".
*/
public class HelloWorld{



	public static void main(String []args){
		String text="Hello, World";
		int occurenceOfO=0, occurenceOfComma=0;

		for (int i=0;i<text.length();i++){
			if(text.charAt(i)=='o' || text.charAt(i)=='O') occurenceOfO++;
			if(text.charAt(i)==',') occurenceOfComma++;
		}

		System.out.println(text +"\nOccurence of \"O\": "+occurenceOfO+ "\nOccurence of \",\": "+occurenceOfComma);


	} 
}