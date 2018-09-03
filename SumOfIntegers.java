package com.guvi;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N digit : ");
		int N = scan.nextInt();
		System.out.println("Enter the K digit : ");
		int K = scan.nextInt();
		int sum = 0;
		
		 int arr[] = new int[N+1];
		 for(int j = 0; j <= N; j++)
		 {
			 arr[j] = j;
		 }
		 
		 for(int i = 0; i <= K; i++) {
			 sum = sum + arr[i];
		 }
		 
		 System.out.println("Sum of the Integers is : " + sum);
	}

}
