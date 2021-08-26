/*Create a class named 'Shape' with a method to print "This is This is 
shape". Then create two other classes named 'Rectangle', 'Circle' 
inheriting the Shape class, both having a method to print "This is 
rectangular shape" and "This is circular shape" respectively. Create a 
subclass 'Square' of 'Rectangle' having a method to print "Square is a 
rectangle". Now call the method of 'Shape' and 'Rectangle' class by the 
object of 'Square' class.
*/

class Shape{ 	//Parent class

		protected void print(){
			System.out.println("This is shape");
		}

}

class Rectangle extends Shape{ //sub class of shape and parent of square

		protected void printRectangle(){
			System.out.println("This is rectangular shape");
		}
}

class Circle extends Shape{ //subclass of shape

	protected void printCircle(){
		System.out.println("This is circular shape");
	}

}

class Square extends Rectangle{  //subclass of rectangle
	protected void printSquare(){
		System.out.println("Square is a rectangle");
	}
}

public class Inherit{

	public static void main(String[] args){
		Square out = new Square();
		out.print();
		out.printRectangle();
	}

}