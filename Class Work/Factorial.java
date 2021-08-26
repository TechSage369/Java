
/*Write a program to print the factorial of a number by defining a 
method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 
1*2*3*....*(n-1)*n*/
import java.util.Scanner;

public class Factorial{

	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		double result=1;
		int input;

		System.out.print("Enter n!: ");
		input=in.nextInt();

		while(input>=1){
			result*=input;
			input--;
		}

		System.out.println("Factorial: "+result);

	}
}