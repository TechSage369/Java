class Print{
	static void txt(){
		System.out.println("Hello");
	}
}


class Static{
	public static void main(String[] args){
		Print x =  new Print();
		x.txt();
	}
}