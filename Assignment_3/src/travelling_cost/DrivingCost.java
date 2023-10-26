package travelling_cost;

import java.util.Scanner;

public class DrivingCost {
	private float milesDriven;
	private float costPerGallon;
	private float milesPerGallon;
	private float parkingFees;
	private float tolls;
	
	
    public DrivingCost() {}
	public DrivingCost(float milesDriven, float costPerGallon, float milesPerGallon, float parkingFees, float tolls) {
		
		this.milesDriven = milesDriven;
		this.costPerGallon = costPerGallon;
		this.milesPerGallon = milesPerGallon;
		this.parkingFees = parkingFees;
		this.tolls = tolls;
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Miles Driven per day");
		this.milesDriven=sc.nextFloat();
		System.out.println("Enter the Cost per Gallon");
		this.costPerGallon=sc.nextFloat();
		System.out.println("Enter the Miles Per Gallon");
		this.milesPerGallon=sc.nextFloat();
		System.out.println("Enter the Parking fees");
		this.parkingFees=sc.nextFloat();
		System.out.println("Enter the tolls");
		this.tolls=sc.nextFloat();
		
	}
	public void displayTotal() {
		System.out.println("The total cost experienced per day is:"+ calculateTotal());
	}
	public float calculateTotal() {
		float total=((milesDriven/milesPerGallon)*costPerGallon)+parkingFees+tolls;
		return total;
	}
	
	

}
