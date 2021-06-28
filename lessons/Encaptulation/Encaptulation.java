public class Encaptulation{

	private String name;
	private short age;
/*____________________________________________________________________
it is possible to access them if we provide public get and set methods.
____________________________________________________________________*/
	public void getName(String newName){
		this.name=newName;
	}
	public String setName(){
		return name;
	}
	public void getAge(short newAge){
		this.age=newAge;
	}
	public short setAge(){
		return age;
	}



	public static void main(String[] args){
		Encaptulation student =new Encaptulation();
		student.name="Rehan Rai";
		student.age=15;
		System.out.println("Name: "+student.name+".\nAge: "+student.age);
	}
}