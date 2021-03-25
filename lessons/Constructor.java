public class Constructor{
int x;
/*_____________________________________________________________________________________________
the constructor name must match the class name, and it cannot have a return type (like void).
  _____________________________________________________________________________________________*/
		public Constructor(int y){//the constructor is called when the object is created.
			 y++;
			 x=y;
		}


	public static void main(String[] args){

		Constructor myObj= new Constructor(12); //parameter for constructor
		System.out.println("Output using constructor: "+ myObj.x);

	}


}