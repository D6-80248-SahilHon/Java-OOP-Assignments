/*Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/





package details;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	Employee()
	{
		this.firstName="";
		this.lastName="";
		this.monthlySalary=0.0;
		
	}

	public Employee(String firstName, String lastName, double monthlySalary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary>0) {
		this.monthlySalary = monthlySalary;}
		else System.out.println("Salary can't be negative");
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First name :");
		this.firstName=sc.next();
		System.out.println("Enter the Last name :");
		this.lastName=sc.next();
		System.out.println("Enter the Monthly Salary :");
		this.monthlySalary=sc.nextDouble();
		
		
	}
	
	public void display()
	{
		
		System.out.println("Monthly Salary:"+ this.monthlySalary);
	}
	
	
	


}
