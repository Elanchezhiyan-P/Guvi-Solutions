package com.guvi;

import java.util.Scanner;

public class AlphabetOrNot {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);
		
		int charToNum = input;
		
		if(charToNum >= 65 && charToNum <= 90 || charToNum >= 97 && charToNum <= 122) {
			System.out.println("The given character " + input + " is Alphabet");
		}
		else {
			System.out.println("The given character " + input + " is Not an Alphabet");
		}
	}

}


