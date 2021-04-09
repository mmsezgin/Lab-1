package day14_methods_Part2;

public class Lab1_StringTimes {


	public static void main(String[] args) {
		
		stringTimes ("Hi", 2);
		stringTimes ("Hi", 3);
		stringTimes ("Hi", 1);

	
	}
	
	//Question 1: stringTimes method displays the string input in the specified number of times 
	//in same line.
	public static void stringTimes (String textToBeWritten, int NumOfTimes) {

//		First version of method
//		for(int i=1;i<=NumOfTimes;i++) {
//			System.out.print(textToBeWritten);
//		}
//		System.out.println();
		
		//Another way of method
		String str="";

		for(int i=1;i<=NumOfTimes;i++) {
			str = str + textToBeWritten;
		}
		System.out.println(str);
	}
}
