package main;

import java.util.Scanner;

public class Utils {

	public void clear() {
		for(int i = 0; i < 40; i++) {
			System.out.println("");
		}
	}
	
	public void pressEnter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Press enter to proceed");
		scan.nextLine();
	}
}
