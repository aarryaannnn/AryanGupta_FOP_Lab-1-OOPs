package com.gl.emailapplication.service;

import com.gl.emailapplication.model.Employee;

public interface CredentialService {
	public String generateEmail(String firstName, String lastName, String department);
	public String generatePassword();
	public void showCredentials(Employee employee);
}
