package fr.softeam.kata.romanNumerals;


import org.junit.Assert;
import org.junit.Test;

import fr.softeam.kata.romanNumerals.RomanNumeral;


public class RomanNumeralTest {
	
	

	@Test
	public void convert3ToThree() {
		Assert.assertEquals("III",RomanNumeral.convertArabicToRoman(3));
	}

	@Test
	public void convert6ToSix() {
		Assert.assertEquals("VI",RomanNumeral.convertArabicToRoman(6));
	}
	
	@Test
	public void convert9ToNine() {
		Assert.assertEquals("IX",RomanNumeral.convertArabicToRoman(9));
	}
	
	
	@Test
	public void convert14ToXIV() {
		Assert.assertEquals("XIV",RomanNumeral.convertArabicToRoman(14));
	}
	
	@Test
	public void convert19ToXIX() {
		Assert.assertEquals("XIX",RomanNumeral.convertArabicToRoman(19));
	}
	
	@Test
	public void convert80ToLXXX() {
		Assert.assertEquals("LXXX",RomanNumeral.convertArabicToRoman(80));
	}
	
	@Test
	public void convert90ToXC() {
		Assert.assertEquals("XC",RomanNumeral.convertArabicToRoman(90));
	}
	
	@Test
	public void convert400ToCD() {
		Assert.assertEquals("CD",RomanNumeral.convertArabicToRoman(400));
	}
	
	@Test
	public void convert900ToCM() {
		Assert.assertEquals("CM",RomanNumeral.convertArabicToRoman(900));
	}
	
	@Test
	public void convert2016ToMMXVI() {
		Assert.assertEquals("MMXVI", RomanNumeral.convertArabicToRoman(2016));
	}
	
	@Test
	public void convert3000ToMMM() {
		Assert.assertEquals("MMM",RomanNumeral.convertArabicToRoman(3000));
	}

}
