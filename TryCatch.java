/**
Name: TryCatch
Created on: 20/03/18
Created by: Kaja Sawko
**/

public class TryCatch{
	public static void main(String[] args){

		int[] x = {7, 6, 11, 15, 19};

		try{
			System.out.println("The value stored in index 5 is: "+x[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("There was an ArrayOutOfBoundsException");
		}catch(Exception e){
			System.out.println("Warning: Some other exception");
		}

		System.out.println("End of Program");
		Index.main(null);

	}

}

