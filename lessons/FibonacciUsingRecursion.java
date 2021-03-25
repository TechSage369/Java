public class FibonacciUsingRecursion{
	public static void main(String[] args){
		int x=1,y=2,n=15;
		System.out.println("Fibonacci Series: \n");
		fibonacci(x,y,n);

	}

			static int fibonacci(int x,int y,int n){
				int temp;
				if(n!=0){
					System.out.println(x);
					temp=x;
					x=y;
					y=x+temp;

					return fibonacci(x,y,--n);

				}
				else return 0;

			}
}