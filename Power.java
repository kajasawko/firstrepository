/**
Name: 		Power
Created by: Kaja Sawko
Created on: 07/03/18
*/

import java.util.Scanner;

public class Power{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a base: ");
		int base = input.nextInt();

		while(base > 0){
			System.out.println("Please enter  exponent: ");
			int expo = input.nextInt();

			int result = integerPower(base, expo);
			System.out.println(base+" to the power of "+expo+" is "+result);

			System.out.println("Please enter a base: ");
			base = input.nextInt();

		}
	}//end of main

	public static int integerPower(int base, int expo){
		int product = 1;

		for(int i = 1; i <= expo; i++)
			product *= base;

	return product;

	}
}

