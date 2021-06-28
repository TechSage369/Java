/*Program to calculate the HCF of two given positive numbers*/
import java.util.Scanner;
public class HighestCommonMultiple{

   //user defined method using Recursion 
	public int hcf_Of(int x,int y){
		if(y != 0){
			return hcf_Of(y,x%y);
		}
		return x;
	}

	//Main method
	public static void main(String []args){
		int num1,num2;

		HighestCommonMultiple result= new HighestCommonMultiple();//creating object
		Scanner input= new Scanner(System.in);
		// Input
		System.out.print("Enter an Integer A: ");
		num1=input.nextInt();
		System.out.print("Enter an Integer B: ");
		num2=input.nextInt();
		// Output
		System.out.print("\nH.C.F of "+num1+" and "+num2+": "+ result.hcf_Of(num1,num2));
	}
}