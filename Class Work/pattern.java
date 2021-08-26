class UserMethod{
int row,col,space;
		 void patternX(int inp){
		 	int x = (inp+1)/2;
		 	
			for(row=1;row<=x;row++){
				for(space=1;space<=x-row;space++) System.out.print(" ");
				for(col=1;col<=row*2-1;col++) System.out.print("*");

			System.out.print("\n");
			}
			//opposite triangle
			for(row=x-1;row!=0;row--){
				for(space=1;space<=x-row;space++) System.out.print(" ");

				for(col=1;col<=row*2-1;col++) System.out.print("*");

			System.out.print("\n");
			}
		
		}


}

public class pattern{
	public static void main(String []args){
		UserMethod print=new UserMethod();
		print.patternX(5);
	}
}