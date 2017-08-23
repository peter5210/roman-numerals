package com.libertymutual.goforcode.romanNumerals.services;


public class HinduToRomanNumeralConverter {
	String romanNumeral;
	
	public HinduToRomanNumeralConverter() {
		this.romanNumeral="";
	}

	
	public String convert(int numberToConvert) {
		int m = 1000;
		int cm = 900;
		int d = 500;
		int cd = 400;
		int c = 100;
		int xc = 90;
		int l = 50;
		int xl = 40;
		int x = 10;
		int ix = 9;
		int v = 5;
		int iv = 4;
//		int i = 1;
		int doAgain;
	
		doAgain = numberToConvert / m;
		for (int j = 0; j < doAgain; j += 1) {
		romanNumeral = romanNumeral + "M"; 
		} 
		numberToConvert = numberToConvert % m; 
	
		doAgain = numberToConvert / cm;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "CM"; 
		} 
		numberToConvert = numberToConvert % cm;
	
		doAgain = numberToConvert / d;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "D"; 
		} 
		numberToConvert = numberToConvert % d;	
		
		doAgain = numberToConvert / cd;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "CD"; 
		} 
		numberToConvert = numberToConvert % cd;
	
		doAgain = numberToConvert / c;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "C"; 
		} 
		numberToConvert = numberToConvert % c;

		doAgain = numberToConvert / xc;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "XC"; 
		} 
		numberToConvert = numberToConvert % xc;
		
		doAgain = numberToConvert / l;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "L"; 
		} 
		numberToConvert = numberToConvert % l;
		
		doAgain = numberToConvert / xl;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "XL"; 
		} 
		numberToConvert = numberToConvert % xl;
		
		doAgain = numberToConvert / x;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "X"; 
		} 
		numberToConvert = numberToConvert % x;
		
		doAgain = numberToConvert / ix;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "IX"; 
		} 
		numberToConvert = numberToConvert % ix;
		
		doAgain = numberToConvert / v;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "V"; 
		} 
		numberToConvert = numberToConvert % v;
		
		doAgain = numberToConvert / iv;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "IV"; 
		} 
		numberToConvert = numberToConvert % iv;
		
		doAgain = numberToConvert;
		for (int j = 0; j < doAgain; j += 1) {
			romanNumeral = romanNumeral + "I";
		} 
		return romanNumeral;
	} 
}
	
	
