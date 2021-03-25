public class JavaClassAndObject{
//________________________________________________________________________________
	int x=369,y=963;
	String text = "Hi, i\'am learning Java.";
//________________________________________________________________________________
	public static void main(String[] args){
		JavaClassAndObject myObject = new JavaClassAndObject(); //object 1
		JavaClassAndObject myObject2= new JavaClassAndObject();// object 2
//________________________________________________________________________________
		System.out.println(myObject.x);
		System.out.println(myObject.y);
		System.out.println(myObject2.text);

	}
}