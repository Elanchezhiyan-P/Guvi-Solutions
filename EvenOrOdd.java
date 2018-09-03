package com.guvi;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
	  if(input % 2 == 0) {
		  System.out.println("The given number " + input + " is Even" );
	  }
	  else {
		  System.out.println("The given number " + input + " is Odd");
	  }
	  
	}

}
