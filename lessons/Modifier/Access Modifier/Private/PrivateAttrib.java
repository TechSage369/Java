public class PrivateAttrib{

	private int x=45; //The code is only accessible within the declared class 
	//private is bounded withn the declared class and cannot be accessed outside the.ṁ declared class
	private String details= "The value of x is: ";

public static void main(String[] args){
	PrivateAttrib val = new PrivateAttrib();
	System.out.println(val.details + val.x);

}

}