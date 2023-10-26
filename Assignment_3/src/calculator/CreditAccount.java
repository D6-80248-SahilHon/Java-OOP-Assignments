package calculator;

import java.util.Scanner;

public class CreditAccount {
	private int accountNo;
	private double balance;
	private double totalCharged;
	private double totalCreditsApplied;
	
	private static double creditLimit;

	
	public CreditAccount() {
		this(0,0,0,0);
	}
	public CreditAccount(int accountNo, double balance, double totalCharged, double totalCreditsApplied) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.totalCharged = totalCharged;
		this.totalCreditsApplied = totalCreditsApplied;
	}
	
	public void acceptData()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		this.accountNo=sc.nextInt();
		System.out.println("Enter the balance at beginning of month:");
		this.balance=sc.nextDouble();
		System.out.println("Enter the total of all items charged:");
		this.totalCharged=sc.nextDouble();
		System.out.println("Enter the credits applied to customers this month:");
		this.totalCreditsApplied=sc.nextDouble();
		creditLimit=30000;
	}
	
	public void displayData()
	{
		System.out.println("Allowed credit:"+creditLimit);
		System.out.println("Total items charged:"+this.totalCharged);
		System.out.println("Total credits applied this month:"+this.totalCreditsApplied);
		System.out.println("Pending balance:"+this.balance);
		System.out.println("New balance for next month:"+calculator());	
		limitCheck();
	}
	
	public double calculator()
	{
		double newBalance=this.balance+this.totalCharged-this.totalCreditsApplied;
		return newBalance;
	}
	
	public void limitCheck() {
		if (calculator()>creditLimit) System.out.println("Credit limit exceeded");
		else System.out.println("Within Allowed Limit");
	}
	
	
	
}
