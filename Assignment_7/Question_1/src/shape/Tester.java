package shape;

import java.util.Scanner;

public class Tester {
	public static int menu() {
		System.out.println("Enter the number of sides for area to calculate and 0 for circle:");
		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {
		BoundedShape s;
		String shape;

		switch (menu()) {
		case 0:
			s = new Circle();
			s.accept();
			System.out.println(s.toString());
			break;
		case 3:
			s = new Triangle();
			s.accept();
			s.toString();
			break;
		case 4:
			System.out.println("Enter Square or Rectangle:");
			shape = new Scanner(System.in).next();
			if (shape.equals("Square")) {
				s = new Square();
				s.accept();
				System.out.println(s.toString());
			} else {
				s = new Rectangle();
				s.accept();
				System.out.println(s.toString());
			}

			break;
		default:
			System.out.println("PLEASE ENTER THE CORRECT NUMBER OF SIDES (MIN 0)(MAX 4)");
			break;
		}

	}

}
