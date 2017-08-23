package com.libertymutual.goforcode.romanNumerals.services;


public class HinduToRomanNumeralConverter {
	
	String romanNumeral;	
	
	public HinduToRomanNumeralConverter() {
	}

	
	public String convert(int numberToConvert) {
		int newNumber;
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
		int i = 1;
	
		newNumber = numberToConvert / m;
		for (int j = 0; j < newNumber; j += 0) {
		romanNumeral = romanNumeral + "M"; 
		} 
		newNumber = newNumber % m; 
	
		newNumber = numberToConvert / cm;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "CM"; 
		} 
		newNumber = newNumber % cm;
	
		newNumber = numberToConvert / d;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "D"; 
		} 
		newNumber = newNumber % d;	
		
		newNumber = numberToConvert / cd;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "CD"; 
		} 
		newNumber = newNumber % cd;
	
		newNumber = numberToConvert / c;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "C"; 
		} 
		newNumber = newNumber % c;

		newNumber = numberToConvert / xc;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "XC"; 
		} 
		newNumber = newNumber % xc;
		
		newNumber = numberToConvert / l;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "L"; 
		} 
		newNumber = newNumber % l;
		
		newNumber = numberToConvert / xl;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "XL"; 
		} 
		newNumber = newNumber % xl;
		
		newNumber = numberToConvert / x;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "X"; 
		} 
		newNumber = newNumber % x;
		
		newNumber = numberToConvert / ix;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "IX"; 
		} 
		newNumber = newNumber % ix;
		
		newNumber = numberToConvert / v;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "V"; 
		} 
		newNumber = newNumber % v;
		
		newNumber = numberToConvert / iv;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "IV"; 
		} 
		newNumber = newNumber % iv;
		
		newNumber = numberToConvert / i;
		for (int j = 0; j < newNumber; j += 0) {
			romanNumeral = romanNumeral + "I"; 
		} 
		newNumber = newNumber % i;
		return romanNumeral;
	} 
}
	
	
