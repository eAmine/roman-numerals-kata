package fr.softeam.kata.romanNumerals;

public class RomanNumeral {
	/**
	 * This function converts an Arabic number to a Roman one
	 * @param arabicNumber
	 * @return Roman number
	 */
	public static String convertArabicToRoman(int arabicNumber) {
		StringBuilder romanNumber = new StringBuilder();
		
		if(arabicNumber == 5){
			romanNumber.append("V");
		}
		
		else if(arabicNumber == 10){
			romanNumber.append("X");
		}
		
		else if(arabicNumber == 6){
			romanNumber.append("VI");
		}
		
		else{
			
			for (int i = 0; i < arabicNumber; i++) {
			    romanNumber.append("I");
			  }
		}
		
		return romanNumber.toString();
	}

}
