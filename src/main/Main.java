package main;

import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Utils util = new Utils();

	public Main() {
		// TODO Auto-generated constructor stub
		int menu = 0;
		do {
			util.clear();
			
			System.out.println("BJ - JPTable");
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			
			do {
				System.out.print("Choice >> ");
				try {
					menu = scan.nextInt();
					scan.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					scan.nextLine();
					menu = 0;
				}
			} while(menu < 1 || menu > 2);
			
			switch(menu) {
			case 1:
				Simulate s = new Simulate();
				break;
			}
		} while(menu != 2);
		
		System.out.println("Thank you for using the apps!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
}
