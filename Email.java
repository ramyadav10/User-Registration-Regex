package com.bridgelabz.com.bridgelabz;

import java.util.regex.Pattern;

public class Email{
	
	String regexNamePattern="^[A-Z][a-zA-Z]{2,}$";
	String regexEmailPattern="^[A-Za-z+_.-]+@[A-Za-z.-]+$";
	
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
}
