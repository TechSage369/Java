import myPack.*;
public class Main1{
	public static void main(String[] args){
		int val,multiply_val;
		Class1 textClass = new Class1();
		Sum sumClassObj=new Sum();
		Multiply mx=new Multiply();

		val=sumClassObj.sumFun(20,30);
		multiply_val=mx.mulFun(7,4);
		textClass.txt();
		System.out.println("Sum: "+val);
		System.out.println("Multiply: "+multiply_val);
	}
}