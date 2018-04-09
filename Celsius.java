/**
Name: Celcius
Description: Converts Fahrenheit to Celsius
Created by: Kaja Sawko
Created on: 04/04/18
**/

import java.util.Scanner;

public class Celsius{
	public static void main(String[] args){

		int celsius; //variable created to store new temperature

		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature in Fahrenheit: ");
		int fah = input.nextInt(); //creates variable from user input to be used in calculation

		celsius = ((fah - 32)*5)/9; //preforms conversion calculation

		System.out.println(fah+" Fahrenheit is "+celsius+" Celsius\n"); //prints result to screen
		System.out.print(""); //blank line for neatnes

		Convert.main(null); //directs back to Converrt.java
	}
}

