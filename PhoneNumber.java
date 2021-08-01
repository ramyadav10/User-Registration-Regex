package com.bridgelabz.com.bridgelabz;

import java.util.regex.Pattern;

public class PhoneNumber {
	
	static String regexNamePattern="^[A-Z][a-zA-Z]{2,}$";
	static String regexEmailPattern="^[A-Za-z+_.-]+@[A-Za-z.-]+$";
	static String regexPhoneNumberPattern="^[0-9]{2}[\s]?[0-9]{10}$";
	
	public boolean vFirstName(String string) {
		Pattern pattern=Pattern.compile(regexNamePattern);
		return pattern.matches(regexNamePattern, string);
	}
	
	public boolean vLastName(String string) {
		Pattern pattern=Pattern.compile(regexNamePattern);
		return pattern.matches(regexNamePattern, string);
	}
	
	public boolean vEmail(String mail) {
		
		Pattern pattern=Pattern.compile(regexEmailPattern);
		return pattern.matches(regexEmailPattern, mail);
	}

	public boolean vPhoneNumber(String number) {
		Pattern pattern=Pattern.compile(regexPhoneNumberPattern);
		return pattern.matches(regexPhoneNumberPattern, number);
	}
}
		


