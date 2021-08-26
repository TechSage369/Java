import java.util.Scanner;
import java.nio.*;
class AllDetails{
 
 String []name;
 String []date;
   int  []salary;
}

class AllInputOutput extends AllDetails{
Scanner input=new Scanner (System.in);
	public void InputAll(int x){
		for(int i=0;i<x;i++){
			System.out.println("\n\nDetails : "+(i+1));
			System.out.print("Enter Name: ");
			name[i]=input.nextLine();
			System.out.print("Date of joining: ");
			date[i]=input.nextLine();
			System.out.print("Enter Salary: ");
			salary[i]=input.nextInt();
			input.nextLine();

		}
	}

	public void outputAll(int x){
		for(int i=0;i<x;i++){
			System.out.printf("\n%10d %30s| %10s | %10d |",(i+1),name[i],date[i],salary[i]);
		}
	}

}

class Employee extends AllInputOutput{
	public static void main(String []args){
		int limit =10;
		Employee details= new Employee();


		//array of object
		details.name=new String[limit];
		details.date=new String[limit];
		details.salary=new int [limit];

		details.InputAll(limit);

		System.out.printf("\n%10s %30s | %10s | %10s |\n\n","Sl.no","Names","Date","Salary");
		details.outputAll(limit);
		System.out.printf("\n\n");

	}
}