package com.nec;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nec.dsa.TwoSum;
/**
 * 
 * 
 * @author shrey.singh
 *
 */
public class PrimeNumber {
	private static final Logger logger = LoggerFactory.getLogger(PrimeNumber.class);


	public static void main(String[] args) {
		{

			int i, count;
		               System.out.print("Enter n value : ");
		        //scanner used to take input from the user 
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		               System.out.println("Prime numbers between 1 to "+n+" are ");
		
		               //number will start from 2 to nth number
		               for(int j=2;j<=n;j++)
			{
			count=0;
			for(i=1;i<=j;i++)
			{
				//check for reminder 
			   if(j%i==0)
			   {
			        count++;        
			   }
			}
			//if a number have 2 factors it is a prime number
			if(count==2)
			       System.out.print(j+"  ");     
			}
			}
		
	}
}
