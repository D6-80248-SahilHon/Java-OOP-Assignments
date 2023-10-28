package com.office;

public class Helper {
	public static double averageSalLabour(Employee[]arr)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{   if(arr[i] instanceof Labour)
			sum=arr[i].getSalary()+sum;
		}
		return sum/arr.length;
	}
	public static double averageSalSalemans(Employee[]arr)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{   if(arr[i] instanceof Salesman)
			sum=arr[i].getSalary()+sum;
		}
		return sum/arr.length;
	}
	public static double averageSalClerks(Employee[]arr)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{   if(arr[i] instanceof Clerk)
			sum=arr[i].getSalary()+sum;
		}
		return sum/arr.length;
	}
	
}
