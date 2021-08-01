package com.bridgelabz.com.bridgelabz;

import java.util.regex.Pattern;

public class LastName{
	
	String regexNamePattern="^[A-Z][a-zA-Z]{2,}$";
	
	public boolean vFirstName(String string) {
		Pattern pattern=Pattern.compile(regexNamePattern);
		return pattern.matches(regexNamePattern, string);
	}
	
	public boolean vLastName(String string) {
		Pattern pattern=Pattern.compile(regexNamePattern);
		return pattern.matches(regexNamePattern, string);
	}
}
