// dynamic method Dispatch
class University{
	public void callMethod(){
		System.out.println("University: NBU");
	}
}

class College extends University{
		public void callMethod(){ //override callMethod()
		System.out.println("College: SJC");
	}
}

class College1 extends University{
		public void callMethod(){//override callMethod()
		System.out.println("College: GC");
	}
}

public class Dispatch{
	public static void main(String []args){

		University uni = new University(); //Creating objects
		College coll= new College();
		College1 coll1=new College1();
		University ref;//Obtaining a reference 

		ref=uni; //ref refers to University obj.
		ref.callMethod();//calls university version of method

		ref=coll;//ref refers to College obj.
		ref.callMethod();//calls College version of method

		ref=coll1;//ref refers to College1 obj.
		ref.callMethod();//calls College version of method
	}	
}