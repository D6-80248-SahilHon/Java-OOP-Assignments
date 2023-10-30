package practice.strings;

public class StrPrac {

	public static void main(String[] args) {
		String s1="sunbeam";
		String s2="sunbeam";
		System.out.println(s1==s2);
	    System.out.println(s1.equals(s2));
	    
	    String s3=new String("sunbeam");
	    String s4=new String("sunbeam");
	    System.out.println(s3==s4);
	    System.out.println(s3.equals(s4));
	    
	    String s5 = "Sunbeam";
	    String s6 = new String("Sunbeam");
	    System.out.println(s5 == s6);
	    System.out.println(s5.equals(s6));
	    
	    String s7 = "Sunbeam";
	    String s8 = "Sun" + "beam";
	    System.out.println(s7 == s8);
	    System.out.println(s7.equals(s8));
	    
	    String s9 = "Sunbeam";
	    String s10 = "Sun";
	    String s11 = s10 + "beam";
	    System.out.println(s9 == s11);
	    System.out.println(s9.equals(s11));
	    
	    String s12 = "Sunbeam";
	    String s13 = new String("Sunbeam").intern();
	    System.out.println(s12 == s13);
	    System.out.println(s12.equals(s13));

	}

}
