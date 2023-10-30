package com.check.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MALAYALAM";
		StringBuilder s2=new StringBuilder(s1);
		s2.reverse();
		String s3=s2.toString();
		System.out.println(s1.equals(s3));
		
		

	}

}
