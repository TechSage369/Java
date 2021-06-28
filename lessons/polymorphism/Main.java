/*Polymorphism uses those methods to perform different tasks.*/
class College{

	public void student(){
		System.out.println("St. Joseph College");
	}
}

class Name1 extends College{
	public void student(){
		System.out.println("Nishchal Rai");
	}
}
class Name2  extends College{
	public void student(){
		System.out.println("Nilesh Rai");
	}
}

public class Main{
	public static void main(String[] args){
		College cllg= new College();
		College student1= new Name1();
		College student2=  new Name2();

		cllg.student();
		student1.student();
		student2.student();
	}

}