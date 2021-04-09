package day14_methods_Part2;

public class Lab4_DeerPlay {
	public static void main(String[] args) {
		
		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);
		

	}
	
	//Question number 4: Deer method accepting temperature and season input, 
	//Printing true if deers play otherwise false.
	//The deers in VA play if the temperature is between 60 and 90. Unless it is summer, 
	//then the upper limit is 100 instead of 90.
	//Write a method that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.


	public static void deerPlay (int temperature, boolean isSummer) {

		if (temperature>60 && temperature<90) {
			System.out.println("Deers can play: true");
		}else if (temperature>=90 && temperature <100) {
			if (isSummer) {
				System.out.println("Deers can play: true");
			}else {
				System.out.println("Deers can NOT play: false");
			}
		}else {
			System.out.println("false");

		}
	}// end of method deerPlay

}
