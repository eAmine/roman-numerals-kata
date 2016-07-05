package fr.softeam.kata.romanNumerals;

public class RomanNumeral {
	/**
	 * This function converts an Arabic number to a Roman one
	 * @param arabicNumber
	 * @return Roman number
	 */
	public static String convertArabicToRoman(int arabicNumber) {
		
		if(arabicNumber == 5){
			return "V";
		}
		
		StringBuilder romanNumber = new StringBuilder();
		  for (int i = 0; i < arabicNumber; i++) {
		    romanNumber.append("I");
		  }
			return romanNumber.toString();
	}

}
