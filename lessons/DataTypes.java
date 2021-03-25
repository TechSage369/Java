public class DataTypes{


	public static void main(String[] args){
		/*Data types in java*/

		byte bytesValue=12; // Stores byte whole number from -128 to 127
		short shortValue=200; //stores  2 bytes whole number from -32,768 to 32,767
		int integerValue =23434; //Stores 4 byte whole numbers from -2,147,483,648 to 2,147,483,647 
		long longValue= 324324L; //stores 8 bytes
		// Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float floatValue = 234.66f; //Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double doubleValue= 2334.343234d; //Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean booleanValue=true; // memory use(1 bit) true of false
		char characterValue='N'; //Stores a single character/letter or ASCII values


		System.out.println("Byte Data = "+bytesValue);
		System.out.println("Short Data = "+shortValue);
		System.out.println("Integer Data = "+integerValue);
		System.out.println("Long Data = "+longValue);
		System.out.println("Float Data = "+floatValue);
		System.out.println("Double Data = "+doubleValue);
		System.out.println("Boolean Data = "+booleanValue);
		System.out.println("Character Data = "+characterValue);


	}
}