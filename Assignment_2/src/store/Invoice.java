/* Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities. */



package store;

import java.util.Scanner;

public class Invoice {
   private String partNo;
   private String partDesc;
   private int quantity;
   private double price;
   
 
   
   public Invoice() {
		
		this.partNo = " ";
		this.partDesc = " ";
		this.quantity = 0;
		this.price = 0.0;
	}	   
   
   public Invoice(String partNo, String partDesc, int quantity, double price) {
	
	this.partNo = partNo;
	this.partDesc = partDesc;
	this.quantity = quantity;
	this.price = price;
   }

public String getPartNo() {
	return partNo;
}

public void setPartNo(String partNo) {
	this.partNo = partNo;
}

public String getPartDesc() {
	return partDesc;
}

public void setPartDesc(String partDesc) {
	this.partDesc = partDesc;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public double calculateInvoice()
{
	return this.quantity*this.price;
}

public void accept()
{	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the part no:");
	this.partNo=sc.next();
	System.out.println("Enter the part description:");
	this.partDesc=sc.next();
	System.out.println("Enter the part quantity:");
	this.quantity=sc.nextInt();
	System.out.println("Enter the part price:");
	this.price=sc.nextDouble();
}

public void display()
{
	System.out.println("Part no:"+ this.partNo);
	System.out.println("Part Description:"+ this.partDesc);
	System.out.println("Part price:"+ this.price);
	System.out.println("Part quantity:"+ this.quantity);
	System.out.println("Invoice amount:"+ calculateInvoice());
	
}

};
