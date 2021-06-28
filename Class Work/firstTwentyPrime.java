/*Program to print first 20 prime numbers*/
public class firstTwentyPrime{

			// User defined methods
		static boolean isPrime(int x){
			if(x<=1){
				return false;
			}
			for(int i=2;i<x/2;i++){
				if(x%2==0){
					return false;
				}
			}
			return true;
		}


	public static void main(String[] args) {
		boolean condition;
		int i=2,count=0;

		while(true){
			condition=isPrime(i);
			if(condition==true){
				count++;
				System.out.printf("%3d ",i);

				if(count%10==0){//To print new line after every 10 numbers
					System.out.print("\n");
				}
			}

			//exit when number of primenumbers reach 20 
			if(count>=20){
				break;
			}

			//increment
			i++;
		}


	}
}