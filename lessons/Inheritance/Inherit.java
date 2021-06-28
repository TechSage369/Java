 class Details{//Super class
	protected String greet="Hello Nishchal";
	protected String wish="Have a nice day ahead";
}


public class Inherit extends Details{
	private int age =21;
public static void main(String[] args){
	Inherit details= new Inherit();
	System.out.println(details.greet);
	System.out.println(details.wish);
	System.out.println(details.age);
}

}