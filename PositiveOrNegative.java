package com.guvi;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		if(input<0) {
			System.out.println("Negative");
		}
		else if (input > 0 ) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Zero");
		}

	}

}
