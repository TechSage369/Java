 public class Second{
	public static void main(String[] args){
		MainClass myObject = new MainClass();
		Hello myObject2 = new Hello();

		System.out.println(myObject.text);
		myObject2.myStaticMethod(); //Static void method
		System.out.println(myObject2.text);

	}
}