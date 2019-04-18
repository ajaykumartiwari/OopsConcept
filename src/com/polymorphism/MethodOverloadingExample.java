/**
 * 
 */
package com.polymorphism;

/**
 * @author Ajay Tiwari
 *
 */

/**
 * If a class has multiple methods having same name but different in parameters,
 * it is known as Method Overloading. Overloading is related to compile time (or
 * static) polymorphism.
 * 
 * There are two ways to achieve method overloading 1) By changing number of
 * arguments 2) By changing data types
 * 
 * Method overloading not possible by changing the return type of the methods
 */
public class MethodOverloadingExample {

	/**
	 * @param args
	 */

	// overloading in static methods
	public static int foo(int a) {
		return 10;
	}

	public static int foo(int a, int b) {
		return (a+b);
	}

	public static void main(String[] args) {

		BasicExample basicExample = new BasicExample();
		System.out.println("First Sum Method : " + basicExample.sum(10));
		System.out.println("Overloaded Method : " + basicExample.sum(10, 20));

		System.out.println("Static Method Overloading : "+ foo(1));
		System.out.println("Static Method Overloading with two arguments: "+ foo(1, 2));
		
		
		ChangingDataType dataType = new ChangingDataType();
		
		System.out.println("Integer Data Type  : "+ dataType.add(20, 30));
		System.out.println("Double Data Type  : "+ dataType.add(20.5, 30.5));
		
	}

}
