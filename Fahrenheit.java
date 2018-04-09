/**
Name: Fahrenheit
Description: Converts Celcius to Fahrenheit
Created by: Kaja Sawko
Created on: 04/04/18
**/

import java.util.Scanner;

public class Fahrenheit{
	public static void main(String[] args){

		int fahr; //variable created to store new temperature

		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature in Celsius: ");
		int celsius = input.nextInt();//creates variable from user input to be used in calculation

		fahr = celsius*9/5 + 32; //preforms conversion calculation

		System.out.println(celsius+" Celsius is "+fahr+" Fahrenheit\n"); //prints result to screen
		System.out.print(""); //blank line for neatness


		Convert.main(null); // directs to Convert.java
	}//end of main
}//end of class