package fr.softeam.kata.romanNumerals;


import org.junit.Assert;
import org.junit.Test;

import fr.softeam.kata.romanNumerals.RomanNumeral;


public class RomanNumeralTest {

	@Test
	public void convertOne() {
		Assert.assertEquals("I",RomanNumeral.convertArabicToRoman(1));
	}
	
	
	

}
