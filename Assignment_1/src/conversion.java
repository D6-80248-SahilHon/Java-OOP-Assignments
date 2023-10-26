import java.util.Scanner;

/*Q1. Accept a integer number and when the program is executed print the binary, octal and
hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())*/

public class conversion {

	public static void main(String[] args) {
			System.out.println("Enter the number to convert:");

		    Scanner sc = new Scanner(System.in);
		    int num=sc.nextInt();
		    String binary;
		    String hex;
		    String octal;
		    
		    binary=Integer.toBinaryString(num);
		    hex=Integer.toHexString(num);
		    octal=Integer.toOctalString(num);
		    
		    System.out.println("The given number is:"+num);
		    System.out.println("Binary Equivalent:"+binary);
		    System.out.println("Octal Equvivalent:"+octal);
		    System.out.println("Hexadecimal Equivalent:"+hex);
			
		
	}

}
