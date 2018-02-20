/**
Name: Addition


**/

import java.util.Scanner;

public class Break_Ex2{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;

	System.out.println("See if you can guess the correct number.");
	System.out.println("Enter a number between 1 and 10");

	while(input.hasNext()){
		if(input.nextInt() == 8){
			System.out.println("Match found, it is 8");
			break;
		}


		counter++;
		if(counter == 10){
			System.out.println("No match found");
			break;
		}


  }

	}
}

