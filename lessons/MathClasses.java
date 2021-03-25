public class MathClasses{

public static void main(String[] args){
	int x=2343,y=324,negativeNumber=-234;
/*The Java Math class has many methods that allows you to perform mathematical tasks on numbers.*/
/*The Math.max(x,y) method can be used to find the highest value of x and y*/
	System.out.println("Max Value: "+ Math.max(x,y)); //find maximum value between two
	System.out.println("Min value: "+ Math.min(x,y)); //to find minimum value between two
	System.out.println("Square root of "+x+": "+ Math.sqrt(x));
	System.out.println("Original value: "+negativeNumber+"\n"+"Absolute (Positive) value: "+ Math.abs(negativeNumber));
	System.out.println("Random number: "+Math.random());
}
}