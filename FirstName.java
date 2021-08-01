package com.bridgelabz.com.bridgelabz;

import java.util.regex.Pattern;

public class FirstName {
	
	
	public boolean vFirstName(String string) {
		// TODO Auto-generated method stub
		String regex1="^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern=Pattern.compile(regex1);
		return pattern.matches(regex1, string);
	}
}
