package com.employeeattendence;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String inTime;
    private String outTime;
    private String status;

    // Constructor
    public Employee(int employeeId, String employeeName, String inTime, String outTime, String status) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.inTime = inTime;
        this.outTime = outTime;
        this.status = status;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("In Time: " + inTime);
        System.out.println("Out Time: " + outTime);
        System.out.println("Status: " + status);
    }




	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
        int employeeId = userInput.nextInt();
        userInput.nextLine(); // Consume the newline character
        System.out.print("Enter Employee Name: ");
        String employeeName = userInput.nextLine();
        System.out.print("Enter In Time: ");
        String inTime = userInput.nextLine();
        System.out.print("Enter Out Time: ");
        String outTime = userInput.nextLine();
        System.out.print("Enter Status: ");
        String status = userInput.nextLine();
        Employee employee = new Employee(employeeId, employeeName, inTime, outTime, status);
        employee.displayDetails();
	}

}
