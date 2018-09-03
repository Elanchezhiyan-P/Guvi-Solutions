package com.guvi;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String[] arr =input.split(" ");

		int a[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			 a[i] = Integer.parseInt(arr[i]);
			 
		}
		
		if(a[0] > a[1] && a[0] > a[2]) {
			System.out.println("This is the Greatest number : " + a[0]);
		}
		else if (a[1] > a[0] && a[1] > a[2]) {
			System.out.println("This is the Greatest number : " + a[1]);
		}
		else {
			System.out.println("This is the Greatest number : " + a[2]);

		}
	}

}
