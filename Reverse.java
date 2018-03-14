/**
Name: Reverse
Created by: Kaja Sawko
Created on: 14/03/18
**/

import java.util.Scanner;

public class Reverse{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer <-1 to exit>: ");
		int num = input.nextInt();

		while(num != -1){
			System.out.println(num+" reversed is "+reverseDigits(num));
			System.out.println("Enter an integer <-1 to exit>: ");
			num = input.nextInt();
		}



	} //end of main

	public static int reverseDigits(int num){

		int reverseNum = 0;
		int placeValue;

		while(num > 0){
			placeValue = num % 10;
			num /= 10;
			reverseNum = reverseNum * 10 + placeValue;
		}

		return reverseNum;
	}

}