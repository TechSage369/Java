/*Java Class Attributes*/
public class JavaAttributes{
		int x=369;
		final int y=693; //Constant value 


	public static void main(String[] args){
/*________________________________________________________________________		
		If you create multiple objects of one class,
 	you can change the attribute values in one object,
 	without affecting the attribute values in the other.
  ________________________________________________________________________*/

		JavaAttributes myObject1= new JavaAttributes();
		JavaAttributes myObject2 = new JavaAttributes();

		myObject1.x=12; //override existing values
		System.out.println("overrided Value of x: "+myObject1.x);
		System.out.println("Original value of x: "+ myObject2.x);
		System.out.println("Static value of y: "+myObject2.y);


	}
}