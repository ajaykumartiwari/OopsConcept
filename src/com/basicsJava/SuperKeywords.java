/**
 * 
 */
package com.basicsJava;

/**
 * @author Ajay Tiwari
 *
 * The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 * Whenever we create instance of child class an instance of parent class created implicitly 
 * which is referred by the super reference variable.
 * 
 *   Super can use to refer immediate parent class instance variables
 *   super cab be used to call immediate parent class method
 *   super() can be used to invoke parent class constructor
 *   
 */

class Color1 {
	String color = "Red";
}

class Color2 extends Color1{
	String color = "Black";
	
	void getColor() {
		System.out.println(" Color is : "+ color);
		System.out.println(" Super Color is : "+ super.color);
	}
}
public class SuperKeywords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Color2 c2 = new Color2();
		c2.getColor();

	}

}
