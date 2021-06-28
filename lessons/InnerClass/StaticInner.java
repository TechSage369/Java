class Outer{
	static int x=14,y=15;

	static class Inner{

		void txtMethod(){
			System.out.println("Value of x: "+x);
			System.out.println("Value of y: "+y);
			System.out.println("sum: "+(x+y));
		}
	} 
}

class StaticInner{
	public static void main(String[] args){
		Outer.Inner in= new Outer.Inner();
		in.txtMethod();
	}
}