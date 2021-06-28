class Outer{
	void txt(String x){
		System.out.println(x);
	}


	class Inner{
		public void txtInner(String x){
			System.out.println(x);
		}
	}

}

public class InnerMethod{
	public static void main(String[] args){
		Outer out= new Outer();
		Outer.Inner in =out.new Inner();
		out.txt("I\'ll be the best programmer ");
		in.txtInner("This is My Learning method.");
	}
}