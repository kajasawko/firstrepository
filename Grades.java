/**
Name: Grades
Created by: Kaja Sawko
Created on: 21/02/18
**/

import java.util.Scanner;

public class Grades{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	float ex1, ex2, ex3, ex4, avg;

	System.out.println("Please enter exam 1 grade:");
	ex1 = input.nextFloat();

	System.out.println("Please enter exam 2 grade:");
	ex2 = input.nextFloat();

	System.out.println("Please enter exam 3 grade:");
	ex3 = input.nextFloat();

	avg = (ex1 + ex2 + ex3)/3;

	System.out.println("");

	if(avg >= 90)
		System.out.println("You got an A");
	else if(avg >= 70 && avg <90)
		System.out.println("You got a B");
	else if(avg >= 50 && avg <70)
		System.out.println("you got a C");
	else if(avg < 50)
		System.out.println("You got an F");
	else
		System.out.println("Invalid grade");

	}
}

