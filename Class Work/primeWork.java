/*Program to print all prime numbers in an array of n elements by taking command line arguments*/
import java.util.Scanner;
public class primeWork{

	//method to check Prime Numbers
	static boolean isPrime(int x){
		if(x <=1){
			return false;
		}
		for(int i=2;i<x;i++){
			if(x%i==0){return false;}
		}
		return true;
	}


public static void main(String [] args){
Scanner input = new Scanner(System.in);
int []array; //creating an array
int n,i;
boolean condition;

System.out.print("\nEnter the umber of an element: ");
 n= input.nextInt(); //input number of element in an array
 array=new int[n];
System.out.println("-----------------------------------------\n");
//input for array elements
 for(i=0;i<n;i++){
 	System.out.print("Enter an Integer "+(i+1)+": ");
 	array[i]=input.nextInt();
 }
 
//output
 System.out.println("\n\nAll Prime Numbers:\n--------------------------------");
for(i=0;i<n;i++){
	condition= isPrime(array[i]);
	if(condition==true){
		System.out.print(array[i]+",\t");
	}
}
}
}