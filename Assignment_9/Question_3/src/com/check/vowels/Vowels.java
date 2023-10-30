package com.check.vowels;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the String :");
		s= new Scanner(System.in).next();
		Character c=new Character('c');
		c=s.charAt(s.length()-1);
		c=c.toLowerCase(c);
		if(c.equals('a')||c.equals('e')||c.equals('i')||c.equals('o')||c.equals('u')) {
			System.out.println("True");
				
		}
		else System.out.println("False");
		

	}

}
