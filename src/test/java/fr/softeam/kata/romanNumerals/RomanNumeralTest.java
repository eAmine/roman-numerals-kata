package fr.softeam.kata.romanNumerals;


import org.junit.Assert;
import org.junit.Test;

import fr.softeam.kata.romanNumerals.RomanNumeral;


public class RomanNumeralTest {

	@Test
	public void convertOne() {
		Assert.assertEquals("I",RomanNumeral.convertArabicToRoman(1));
	}
	
	@Test
	public void convertTwo() {
		Assert.assertEquals("II",RomanNumeral.convertArabicToRoman(2));
	}
	
	@Test
	public void convertThree() {
		Assert.assertEquals("III",RomanNumeral.convertArabicToRoman(3));
	}
	

	@Test
	public void convertFive() {
		Assert.assertEquals("V",RomanNumeral.convertArabicToRoman(5));
	}	
	
	@Test
	public void convertSix() {
		Assert.assertEquals("VI",RomanNumeral.convertArabicToRoman(6));
	}
	
	@Test
	public void convertNine() {
		Assert.assertEquals("IX",RomanNumeral.convertArabicToRoman(9));
	}
	
	
	@Test
	public void convertTen() {
		Assert.assertEquals("X",RomanNumeral.convertArabicToRoman(10));
	}
	
	

}
