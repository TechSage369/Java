class Outer{
	int x=40;
	protected class Inner{
		int y=60;
	}
}

class Main{
	public static void main(String[] args){
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();

		System.out.println("Value of x: "+out.x + "\nValue of y: "+in.y);
	}

}