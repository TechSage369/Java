import java.util.Scanner;
public class factorial{
	public static void main(String []args){
		int i,factorialInput;
		long total=1;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter ther factorial number: ");
		factorialInput= input.nextInt();
		for(i=1;i<=factorialInput;i++){
			total*=i;
		}

		System.out.println("Factorial: "+total);

	}
}