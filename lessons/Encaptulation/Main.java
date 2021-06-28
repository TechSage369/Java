public class Main{

public static void main(String[] args){
	Second details=new Second();
	details.setCollege("st. joseph","Nishchal","BCA",(byte)18,(byte)2);


	System.out.println("College Name: "+ details.getCollegeName());
	System.out.println("Student\'s Name: "+ details.getName());
	System.out.println("Age: " + details.getAge());
	System.out.println("Department: "+details.getDepartment());
	System.out.println("Semester: " + details.getSem());



}


}