package day14_methods_Part2;

public class Lab2_Love6 {

	public static void main(String[] args) {
		
		magicSix(6,4);
		magicSix(4,5);
		magicSix(1,5);
		magicSix(12,6);
		
	
	}
	//Question2 : Write a method that accepts number1 and number2. Prints true if either one is 6.
	// or if their sum or difference is 6.
	public static void magicSix (int number1, int number2) {
		if ((number1+number2)==6 || (number1==6) || (number2==6) || (number1-number2)==6 || (number2-number1)==6){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
}
