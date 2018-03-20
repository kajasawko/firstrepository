/**
Name: TwoD_Array
Created on: 20/03/18
Created by: Kaja Sawko
**/

public class TwoD_Array{
	public static void main(String[] args){

		int[][] x = {{1, 2},{3, 4}};


		System.out.println("Using enhanced for loop to print values");

		for(int[] i: x){
			for(int j: i)
				System.out.println(j);
		}

		System.out.println("Using standard for loop to print values");

				for(int i = 0; i < x.length; i++){
					for(int j = 0; j < x[i].length; j++)
					System.out.println(x[i][j]);
				}





	}

}

