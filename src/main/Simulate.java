package main;

import java.util.Scanner;

public class Simulate {

	Scanner scan = new Scanner(System.in);
	Utils util = new Utils();
	Tables t = new Tables();
	
	public Simulate() {
		int num1, num2;
		do {
			System.out.print("Input the first number [1 - 100] (inclusive): ");
			try {
				num1 = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
				num1 = 0;
			}
		} while(num1 < 1 || num1 > 100);
		
		do {
			System.out.print("Input the second number [1 - 100] (inclusive): ");
			try {
				num2 = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
				num2 = 0;
			}
		} while(num2 < 1 || num2 > 100);
		
		t.dataTypes(num1, num2);
		util.pressEnter();
		t.arithmetic(num1, num2);
		util.pressEnter();
		
		util.clear();
		
		boolean bool1 = false, bool2 = false;
		do {
			System.out.print("Give me value for p1 [true | false]: ");
			try {
				bool1 = scan.nextBoolean();
				scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		} while(bool1 != true && bool1 != false);
		
		do {
			System.out.print("Give me value for p2 [true | false]: ");
			try {
				bool2 = scan.nextBoolean();
				scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				scan.nextLine();
			}
		} while(bool2 != true && bool2 != false);
		
		t.logical(bool1, bool2);
		util.pressEnter();
	}
}
