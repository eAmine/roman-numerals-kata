package fr.softeam.kata.romanNumerals;

public class RomanNumeral {
	/**
	 * This function converts an Arabic number to a Roman one
	 * @param arabicNumber
	 * @return Roman number
	 */
	public static String convertArabicToRoman(int arabicNumber) {
		
		StringBuilder romanNumber = new StringBuilder();
		int difference = arabicNumber ;
		
		if(difference == 10){
			romanNumber.append("X");
			difference -= 10;
		}
		
		else if(difference == 9){
			romanNumber.append("IX");
			difference -= 9;
		}
		
		else if(difference >= 5){
			romanNumber.append("V");
			difference -= 5;
		}

		for (int i = 0; i < difference; i++) {
			 romanNumber.append("I");
		}
		
		return romanNumber.toString();
	}

}
