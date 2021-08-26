/*program to check whether number is happy or unhappy */
import java.util.Scanner;
 class HappyOrUnhappy{
	private int i,reminder,sum;

		 	boolean CheckHappy(int x){
			sum=0;
			for(i=x;i!=0;i/=10){
				reminder=i%10; //Seperating digit
				sum+= Math.pow(reminder,2);
			}
			// to get boolean value
			if(sum==1){return true;}
			else if(sum==4){return false;}

			return CheckHappy(sum); //Recursion

		}		}



public class Main{
	public static void main(String []args){
				int input;
				Scanner scan= new Scanner(System.in);
				HappyOrUnhappy myObject =new HappyOrUnhappy();

				System.out.print("Enter an Integer: ");
				input=scan.nextInt();

				boolean result = myObject.CheckHappy(input);//calling method
				// Outputs
				if(result==true) System.out.println("\n" + input +" is a happy number.");
							else System.out.println("\n" + input +" is an unhappy number.");

		}}
