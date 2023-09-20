package com.gl.emailapplication.service;

import java.util.Random;

import com.gl.emailapplication.model.Employee;

public class CredentialServiceImplementaion implements CredentialService {
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "^=+-/.?&!@#$%*_)";
	
	@Override
	public String generateEmail(String firstName, String lastName, String department) {
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".gl.in";
	}
	
	@Override
	public String generatePassword() {
		String values = capitalLetters + specialCharacters + smallLetters + numbers;

		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFullName() + " your generated credentials are as follows: ");
		System.out.println("Email\t\t" + employee.getEmail());
		System.out.println("Password\t" + employee.getPassword());
	}
	
	
}
