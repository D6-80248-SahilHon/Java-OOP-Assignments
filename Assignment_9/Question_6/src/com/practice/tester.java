package com.practice;

import java.util.Scanner;

enum Gender {
	MALE, FEMALE
}

enum Menu {
	EXIT, ADD, DISPLAY, FIND
}

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People p[] = new People[5];
		int index = 0;
		for (Menu m : Menu.values()) {
			System.out.println(m.ordinal() + "." + m.name());
		}

		Menu m1;
		int flag = 0;
		String find;

		System.out.println("Enter your choice:");
		String input = new Scanner(System.in).next();
		m1 = Menu.valueOf(input.toUpperCase());

		while (!input.equalsIgnoreCase("EXIT")) {
			if (flag == 1) {
				for (Menu m : Menu.values()) {
					System.out.println(m.ordinal() + "." + m.name());
				}
				System.out.println("Enter your choice:");
				input = new Scanner(System.in).next();
				m1 = Menu.valueOf(input.toUpperCase());
			}

			switch (m1) {
			case EXIT:
				flag = 1;
				break;
			case ADD:
				flag = 1;
				if (index < 5) {
					p[index] = new People();
					p[index].accept();
					index++;
				} else {
					System.out.println("FULL");
				}
				break;

			case DISPLAY:
				flag = 1;
				for (int i = 0; i < index; i++) {
					System.out.println(p[i].toString());
				}
				break;

			case FIND:
				flag = 1;
				System.out.println("Enter the name:");
				find = new Scanner(System.in).next();
				for (int i = 0; i < index; i++) {
					if(find.equalsIgnoreCase(p[i].getName()))
					{
						p[i].toString();
					}
				}
				
				break;

			default:
				break;
			}

		}

	}
}
