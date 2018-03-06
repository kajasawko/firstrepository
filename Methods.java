/**
Name: Methods
Created on: 06/03/18
Created by: Kaja Sawko
*/

public class Methods{

	public static void main(String[] args){
		Methods method = new Methods();
		method.method1();
		Index.main(null);
	}

	public void method1(){
		System.out.println("Method 1 here calling methid 2");
		method2();
	}

	public void method2(){
		System.out.println("Hi method 1, from method 2, calling method 3");
		method3();
	}

	public void method3(){
		System.out.println("Method 3 here, tell method 1 say hi");
		//method1();
	}


}