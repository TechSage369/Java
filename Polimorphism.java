 class College{
	public void name(){
		System.out.println("St. Joseph Colloge");
	}
}
class Student1 extends College{
	public void name(){
		System.out.println("Nishchal Rai");
	}
}
class Student2 extends College{
	public void name(){
		System.out.println("Nilesh Rai");
	}
}
class Student3 extends College{
	public void name(){
		System.out.println("Anish Thapa");
	}
}

public class Polimorphism{

	public static void main(String[] args) {
		College college=new College();
		College student1=new Student1();
		College student2=new Student2();
		College student3=new Student3();
		college.name();
		student1.name();
		student2.name();
		student3.name();
	}
}