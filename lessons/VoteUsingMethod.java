public class VoteUsingMethod{
	static void voter(String name, byte age){
		if(age<18){
			System.out.println("!sorry "+name+" you can\'t vote.");
		}
		else System.out.println("Hi "+name+", You can vote");
	}

public static void main(String[] args){
	voter("Nishchal Rai",(byte)21);
	voter("Rehan rai",(byte)13);
	voter("supriya Rai",(byte)20);
}


}