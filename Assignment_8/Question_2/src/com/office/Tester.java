package com.office;

import java.util.Scanner;

public class Tester {
	public static int menu() {
		System.out.println("Enter the choice");
		System.out.println("0.EXIT");
		System.out.println("1.ADD LABOUR");
		System.out.println("2.ADD SALESMAN");
		System.out.println("3.ADD CLERk");
		System.out.println("4.DISPLAY AVERAGE SALARY OF LABOURS");
		System.out.println("5.DISPLAY AVERAGE SALARY OF SALESMAN");
		System.out.println("6.DISPLAY AVERAGE SALARY OF CLERK");
		
		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {

		int choice;
		int index = 0;
		Employee e[] = new Employee[3];

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 0:

				break;
			case 1:
				if (index < 3) {
					e[index] = new Labour();
					index++;
					e[index].accept();
				} else {
					System.out.println("Aur vacancies are full!!");
				}

				break;
			case 2:
				if (index < 3) {
					e[index] = new Salesman();
					index++;
					e[index].accept();
				} else {
					System.out.println("Aur vacancies are full!!");
				}

				break;
			case 3:
				if (index < 3) {
					e[index] = new Clerk();
					index++;
					e[index].accept();
				} else {
					System.out.println("Aur vacancies are full!!");
				}

				break;
			case 4:
				System.out.println(Helper.averageSalLabour(e));
				break;
			case 5:
				System.out.println(Helper.averageSalSalemans(e));
				break;
			case 6:
				System.out.println(Helper.averageSalClerks(e));
				break;

			default:
				break;
			}
		}
	}

}
