package com.guvi;

import java.util.Scanner;

public class NTimesHello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatNo = scan.nextInt();
		
		for(int i = 0;i <= repeatNo; i++) {
			System.out.println("Hello");
		}
	}

}
