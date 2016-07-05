package fr.softeam.kata.romanNumerals;

import org.apache.commons.lang3.StringUtils;

public class RomanNumeral {
	
	private static final int[] ARABIC_NUMBERS  = { 1000,900,500,400,100,90,50,40,10,9,5,4,1 };
	private static final String[] ROMAN_NUMBERS = { "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };

	/**
	 * This function converts an Arabic number to a Roman one
	 * @param arabicNumber
	 * @return Roman number
	 */
	public static String convertArabicToRoman(int arabicNumber) {
		
		String romanNumber = StringUtils.EMPTY;
		
	      for (int i = 0; i < ARABIC_NUMBERS.length; i++) {
	         while (arabicNumber >= ARABIC_NUMBERS[i]) {
	        	 romanNumber += ROMAN_NUMBERS[i];
	        	 arabicNumber -= ARABIC_NUMBERS[i];
	         }
	      }
	      return romanNumber;
	}
}
