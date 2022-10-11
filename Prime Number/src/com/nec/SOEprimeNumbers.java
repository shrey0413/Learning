package com.nec;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nec.dsa.TwoSum;
/*
 * Sieve of Eratosthenes is the ancient algorithm to find prime numbers up to a given number n
 * 
 * 
 */

public class SOEprimeNumbers {
	private static final Logger logger = LoggerFactory.getLogger(SOEprimeNumbers.class);

	public static void main(String[] args) {

		logger.info("Findin prime numbers using Seive Of EratoSthenes Algorithym");
		boolean isPrime[] = seiveOfEratoSthenes(20);
		
		logger.info("Starting count with their status");
		for (int i = 0; i <= 20; i++) {
			if(isPrime[i]==true)
			System.out.println(i +" is prime number" );
			
		}

	}

	// Given a number int n, print all primes smaller than or equal to n.
	static boolean[] seiveOfEratoSthenes(int n) {
		// array of n+1 to skip 0th array index
		logger.info("An array of n+1 is created");
		boolean isPrime[] = new boolean[n + 1];

		// marked all true
		logger.info("Filling the array as true on value prime");
		Arrays.fill(isPrime, true);
		// for 0th index of value 0
		logger.info("0th index is false ");
		isPrime[0] = false;

		// for 1st index of value 1
		logger.info("1st index is false ");
		isPrime[1] = false;

		// loop will execute from value 2 and skip 0 & 1
		// till i is less the square root of nth number
		logger.info("count start from 2 to the square root of nth number");
		for (int i = 2; i * i <= n; i++) {

			// for 2nd multiple and find divisible number by the multiple i
			logger.info("finding 2nd multiple of number i ");
			for (int j = 2 * i; j <= n; j += i) {

				// marked as false due to multiple factors of i
				logger.info("Multiples of number are false Prime number j");
				isPrime[j] = false;

			}

		}
		// Print all prime numbers

		return isPrime;
	}
}
