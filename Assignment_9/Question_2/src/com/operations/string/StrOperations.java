/*2. Write methods to perform following string conversions.
Bank Of Maharashtra --> BOM
this is string --> This Is String
Example --> eXaMpLe
www.sunbeaminfo.com --> www.sunbeaminfo.in*/


package com.operations.string;

public class StrOperations {

	public static void main(String[] args) {
		String s1="Bank Of Maharashtra";
		String s2[]=s1.split(" ");
		for(String s:s2) System.out.print(s.charAt(0));
		System.out.println();
		
		String s3="this is string";
		String s4[]=s3.split(" ");
		Character c=new Character('c');
		for(String s:s4)
		{	c=s.charAt(0);
			System.out.print(c.toUpperCase(c)+s.substring(1)+" ");
		}
		System.out.println();
		
		String s5="www.sunbeaminfo.in";
		String s6=s5.replace("com", "in");
		System.out.println(s6);
		
		
		String s7="Example";
		Character c2=new Character('c');
		String s8="";
		for(int i=0;i<s7.length();i++)
		{	c=s7.charAt(i);
			if(i%2!=0)
			{
				s8=s8+c.toUpperCase(c);
			}
			else 
			{
				s8=s8+c.toLowerCase(c);
			}
		}
		System.out.println(s8);
		
		
		

	}

}
