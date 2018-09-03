package com.guvi;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		boolean flag = false;

		if (year % 400 == 0) {
			flag = true;
		} else if ((year & 100) == 0) {
			flag = false;
		} else if (year % 200 == 0) {
			flag = false;
		} else if (year % 300 == 0) {
			flag = false;
		}
		if (flag) {
			System.out.println("This year " + year + " is a Leap Year");
		} else {
			System.out.println("This year " + year + " is not a Leap Year");
		}
	}

}
