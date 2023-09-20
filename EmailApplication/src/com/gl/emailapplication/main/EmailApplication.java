package com.gl.emailapplication.main;

import com.gl.emailapplication.model.Employee;
import com.gl.emailapplication.service.CredentialServiceImplementaion;
import java.util.Scanner;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialServiceImplementaion service = new CredentialServiceImplementaion();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		String firstName = sc.next();
		System.out.print("Enter Last Name: ");
		String lastName = sc.next();

		Employee employee = new Employee(firstName, lastName);
		
		
			System.out.println("Please enter the department from the following ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.print("You selected: ");
	
			int option = sc.nextInt();
	
			String department = "";
			
			switch (option) {
			case 1:
				department = "tech";
				break;
			case 2:
				department = "ad";
				break;
			case 3:
				department = "hr";
				break;
			case 4:
				department = "lg";
				break;
			default:
				System.out.println("Enter a valid option");
				break;
			}
		
		String generatedEmail = service.generateEmail(employee.getFirstName(), employee.getLastName(), department);
		String generatedPassword = service.generatePassword();
		employee.setEmail(generatedEmail);
		employee.setPassword(generatedPassword);
		service.showCredentials(employee);
		sc.close();
	}

}
