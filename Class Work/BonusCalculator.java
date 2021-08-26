import java.util.Scanner;
public class BonusCalculator{



	public static void main(String[] args){
		Scanner in= new Scanner(System.in);

		int salary,serviceYear;

		System.out.print("Enter Your Salary: ");
		salary= in.nextInt();
		System.out.print("Enter Year of Service: ");
		serviceYear= in.nextInt();

		if(serviceYear>5){
			System.out.println("Your salary + bonus: "+ (salary+(salary)*5/100));
		}
		else{
			System.out.println("You are not eligible for bonus as you have less service years.");
		}

	}
}