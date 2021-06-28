/*Program to print only prime numbers between 1 and 100*/
public class primeNumbersLessThanHundred{

			// User defined method to check prime or not
		static boolean isPrime(int x){
			if(x<=1){
				return false;
			}
			for(int i=2;i<x/2;i++){
				if(x%i==0){
					return false;
				}
			}
			return true;
		}

public static void main(String []args){
int i,j,count=0;
boolean condition;
	for(i=1;i<=100;i++){
		condition=isPrime(i);
		if(condition==true){
			System.out.printf("%3d , ",i);//using like c language to justify contents
			count++;

			// it will provide new line after every 10 numbers
			if(count%10==0){System.out.println("\n");}
		}
	}
}

}