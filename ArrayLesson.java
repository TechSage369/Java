public class ArrayLesson{
	public static void main(String[] args){
		int arr[]=new int[5];
		int i;
		int j=5;

		for(i=0;i<5;i++){
			arr[i]=j;
			j*=5;

		}
		for(i=0;i<5;i++){
			System.out.println("Array "+ i +" = "+arr[i]);
		}

	}
}