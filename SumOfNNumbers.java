package com.guvi;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sumDigit = scan.nextInt();
		int sum=0;
		
		for(int i = 0; i <= sumDigit; i++) {
		 sum = sum + i;
		}
		System.out.println(sum);
	}

}
