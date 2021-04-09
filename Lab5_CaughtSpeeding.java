package day14_methods_Part2;

public class Lab5_CaughtSpeeding {

	public static void main(String[] args) {
 
		caughtSpeeding(60,false);
		caughtSpeeding(65,false);
		caughtSpeeding(60,true);

	}
	
	//Question 5: Speeding method that computes the ticket result
	//You are driving a little too fast, and a police officer stops you. 
	//Write a method to compute the result: 0=no ticket, 1=small ticket, 2=big ticket. 
	//If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, 
	//the result is 1. If speed is 81 or more, the result is 2. 
	//Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
	public static void caughtSpeeding(int speed, boolean isItYourBirthday) {

		if(speed <=60) {
			System.out.println("0=no ticket");
		}else if(speed>60 && speed <=80) {
			if((isItYourBirthday) && (speed-60)<=5){
				System.out.println("0=no ticket");
			}else {
			System.out.println("1=small ticket");
			}
		}else if(speed>=81 ) {
			if((isItYourBirthday) && (speed-80)<=5){
				System.out.println("1=small ticket");
			}
		}else {
			System.out.println("2=big ticket");		

		}
	}//end of caughtSpeeding method

	// Caught speeding method done by Ozzi
//	public static void caughtSpeeding(int speed,boolean isBirthday) {
		
//		if(isBirthday) {
//			if(speed<=65) {
//				System.out.println(0);
//			}else if(speed>=66 && speed <=85) {
//				System.out.println(1);
//			}else if(speed>=86) {
//				System.out.println(2);
//			}
//		}else {
//			if(speed<=60) {
//				System.out.println(0);
//			}else if(speed>=61 && speed <=80) {
//				System.out.println(1);
//			}else if(speed>=81) {
//				System.out.println(2);
//			}
//		}
		
//	}
	
	
}
