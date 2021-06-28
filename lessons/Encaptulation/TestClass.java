public class TestClass{
	private String name;

	public void setName(String newName){
		this.name=newName;	} // The this keyword is used to refer to the current object
	public String getName(){
		return name;
	}


}
/*______________________________________________________________________________________________________________________

			Get and Set

private variables can only be accessed within the same class
(an outside class has no access to it).
However it is possible to access them if we provide public get and set methods.


	Use of Encaptulation

Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data
__________________________________________________________________________________________________________________________*/