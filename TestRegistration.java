package com.bridgelabz.com.bridgelabz;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class TestRegistration {

@Test
public void CheckFirstName(){
	FirstName validator=new FirstName();
	boolean result=validator.vFirstName("Ram");
	Assert.assertEquals(true, result);
}

@Test
public void CheckLastName(){
	LastName validator=new LastName();
	boolean result=validator.vLastName("Yadav");
	Assert.assertEquals(true, result);
}

@Test
public void CheckEmail(){
	String mail="abc.xyz@bl.co.in";
	Email validator=new Email();
	boolean result=validator.vEmail(mail);
	Assert.assertTrue(result);
}

@Test
public void CheckPhoneNumber(){
	String number="91 9561300440";
	PhoneNumber validator=new PhoneNumber();
	boolean result=validator.vPhoneNumber(number);
	Assert.assertTrue(result);
}

@Test
public void CheckPassword(){
	String pwd="Pasword@123";
	Password validator=new Password();
	boolean result=validator.vPassword(pwd);
	Assert.assertTrue(result);
}
}
