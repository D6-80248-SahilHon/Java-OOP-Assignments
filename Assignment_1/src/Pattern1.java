
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int height=5;
        
        
        for(int i=1;i<=height;i++)
        {
        	for(int j=0;j<=height-i;j++)
        	{
        		System.out.print(" ");
        		
        	}
        	for(int k=1;k<=i;k++)
        	{
        		System.out.print("* ");
        	}
            System.out.println();
        }
	}

}
