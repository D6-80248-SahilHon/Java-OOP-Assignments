import java.util.Scanner;

/*3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option , display total bill & exit. */


public class FoodMenu {

	public static void main(String[] args) {
		int choice=11;
		int price;
		int quantity;
		int bill=0;
	
		while(choice!=10)
		{System.out.println("Enter the Choice:");
		System.out.println("0:DOSA");
		System.out.println("1:POHA");
		System.out.println("2:IDLI");
		System.out.println("3:SAMOSA");
		System.out.println("4:PAKODA");
		System.out.println("5:MISAL PAV");
		System.out.println("6:BREAD JAM");
		System.out.println("7:PAV BHAJI");
		System.out.println("8:BREAD JAM");
		System.out.println("9:UTTAPPAM");
		System.out.println("10:GENERATE BILL");
		
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
			switch(choice)
			{
			case 0:
					price=50;
					System.out.println("Enter the quantity in terms of plates:");
					quantity=sc.nextInt();
					bill+=(price*quantity);	
				break;
			case 1:
				price=30;
				System.out.println("Enter the quantity in terms of plates:");
				quantity=sc.nextInt();
				bill+=(price*quantity);	
				break;
			case 2:
				price=20;
				System.out.println("Enter the quantity in terms of plates:");
				quantity=sc.nextInt();
				bill+=(price*quantity);	
				break;
			case 3:
				price=60;
				System.out.println("Enter the quantity in terms of plates:");
				quantity=sc.nextInt();
				bill+=(price*quantity);	
				break;
			case 4:
				price=55;
				System.out.println("Enter the quantity in terms of plates:");
				quantity=sc.nextInt();
				bill+=(price*quantity);	
				break;
			case 5:
				price=70;
				System.out.println("Enter the quantity in terms of plates:");
				quantity=sc.nextInt();
				bill+=(price*quantity);	
				break;
			case 6:price=5;
			System.out.println("Enter the quantity in terms of plates:");
			quantity=sc.nextInt();
			bill+=(price*quantity);	
				break;
			case 7:price=5;
			System.out.println("Enter the quantity in terms of plates:");
			quantity=sc.nextInt();
			bill+=(price*quantity);		
				break;
			case 8:
				price=50;
				System.out.println("Enter the quantity in terms of plates:");
				quantity=sc.nextInt();
				bill+=(price*quantity);	
				break;
			case 9:
				price=10;
				System.out.println("Enter the quantity in terms of plates:");
				quantity=sc.nextInt();
				bill+=(price*quantity);	
				break;
			case 10:
				System.out.println("-------------------------------------------------");
				System.out.println("YOUR BILL IS:"+bill);
				System.out.println("-------------------------------------------------");
				break;
			default:System.out.println("You have entered the wrong choice..");	
			}
		}
		
		

	}

}
