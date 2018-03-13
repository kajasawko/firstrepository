/**
Name: Shadow
Created by: Kaja Sawko
Created on: 13/3/18

**/


public class Shaddow{
	int x = 1;


	public static void main(String[] args){
		Shaddow s = new Shaddow();
		System.out.println("Local x = "+s.localVar());
		System.out.println("Global x from method is: "+s.globalVar());
		System.out.println("Global x from attribute is: "+s.x);

		Index.main(null);
	}

		int globalVar(){
			return this.x;
		}

		int localVar(){
			int x = 2;
			return x;
		}



}