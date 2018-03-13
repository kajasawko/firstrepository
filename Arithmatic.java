/**
Name: Arithmatic
Created by: Kaja Sawko
Created on: 13/3/18

**/


public class Arithmatic{

	public static void main(String[] args){
		Arithmatic a = new Arithmatic();
		System.out.println("2 + 3 = "+a.addNumbers(2,3));
		System.out.println("2 + 3 + 5 = "+a.addNumbers(2,3,5));
		Index.main(null);

	}

	public int addNumbers(int x, int y){
		return x + y;
	}

	public int addNumbers(int x, int y, int z){
		return x + y + z;
	}



}