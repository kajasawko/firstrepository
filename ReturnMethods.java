/**
Name: ReturnMethods
Created on: 06/03/18
Created by: Kaja Sawko
*/

public class ReturnMethods{

	public static void main(String[] args){
		ReturnMethods methods = new ReturnMethods();
		System.out.println("Value returned: "+methods.method1());
		//Index.main(null);
	}

	public int method1(){
		System.out.println("Method 1 here calling method 2");
		return method2();
	}

	public int method2(){
		System.out.println("Hi method 1, from method 2, calling method 3");
		return method3();
	}

	public int method3(){
		System.out.println("Method 3 here, tell method 1 I say hi");
		return 5;
	}


}