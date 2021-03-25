public class MethodOverloading{

	static int sum(int x,int y){
		return x+y;
	}
	static double sum(double x,double y){
		return x+y;
	}



public static void main(String[] args){
	int intSum=sum(10,200);
	double doubleSum=sum(10.334,234.233);
	System.out.println("Integer: "+intSum);
	System.out.println("Double: "+doubleSum);

}

}