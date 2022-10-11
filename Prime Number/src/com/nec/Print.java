package com.nec;

import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		
	
	 // Creates a Scanner 'sc' instance which takes input from keyboard
	Scanner sc= new Scanner(System.in);
	System.out.println("How many time you want to print the message");
	
	int i= sc.nextInt();
	
	if(i<100)
		for(int j=1; j<=i; j++)
		{
			System.out.println("User want to print the input by "+ i +" times");
		}
		
	
		
	}
	
	
	}


