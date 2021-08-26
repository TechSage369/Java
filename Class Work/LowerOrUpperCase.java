import java.util.Scanner;
public class LowerOrUpperCase{

	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		char x;
		System.out.print("Enter a character: ");
		x=in.next().charAt(0);

		if(x>='A' && x<='Z' ){
			System.out.print(x+" is a upper case alphabet");
		}
		else if(x>='a' && x<='z'){
			System.out.print(x+" is a lower case alphabet");
		}
		else {
			System.out.print(x+" is not an alphabet");
		}

	}
}