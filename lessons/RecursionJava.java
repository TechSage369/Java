public class RecursionJava{
	static int sum(int x){
		if(x!=0) return x+sum(--x);
		else return 0;
	}

public static void main(String[] args){
	int totalSum=sum(2);
	System.out.println("Recursive Value: "+totalSum);
}
}