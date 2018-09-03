package com.guvi;

import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String a = input + "";

		System.out.println("Length of the given digit " + input + " is : " + a.length());
	}

}
