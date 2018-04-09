/**
Name: Convert
Description: Program that converts temperature between Celcius and Fahrenheit
Created by: Kaja Sawko
Created on: 04/04/18
**/

import java.util.Scanner;

public class Convert{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

				System.out.println("Select an option:");
				System.out.println("1. Fahrenheit to Celsius");
				System.out.println("2. Celcius to Fahrenheit");
				System.out.println("3. Exit");
				// option menu

				System.out.println(""); //blank line for neatness

				System.out.print("Choice: ");
				int choice = input.nextInt(); //user input to corespond to case number

				switch(choice){
					case 1:
				 		Celsius.main(null); //directs to Celsius.java
				 	break;

				 	case 2:
				   		Fahrenheit.main(null); //directs to Fahrenheit.Java
				 	break;

		        	case 3:
				    	System.out.println("Exiting...");
		       		break;
		       		//exits out of the program


				}
				//end of switch


			Index.main(null);
			//directs to Index.java
	} //end of main
} //end of class





