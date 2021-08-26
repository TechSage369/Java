/*Create a class named 'Student' with string variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class student*/
public class Student{
	String name;
	int roll_no;


public static void main(String []args){
	Student object = new Student();
	object.name ="John";
	object.roll_no= 2;


	System.out.println("Name: "+object.name);
	System.out.println("Roll No. : "+ object.roll_no);


}

}