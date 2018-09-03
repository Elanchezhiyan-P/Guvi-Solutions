package com.guvi;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character to find Vowel Or Consonant : ");
		char input = scan.next().charAt(0);;
		
		if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
			System.out.println("The given Character " + input + " is Vowel");
		}
		else{
	      System.out.println("The given Character " + input + " is Consonant");
		}
	}

}
