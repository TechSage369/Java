import java.util.Scanner;
public class findSum{



	public static void main(String[] args){
		int a,b;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter an integer A: ");
		a= input.nextInt();
		System.out.print("Enter an integer B: ");
		b= input.nextInt();

		System.out.println("sum of "+a+ " and "+b+" is "+(a+b)+".");

	}
}