/**
 * 
 */
package com.polymorphism;

/**
 * @author Ajay Tiwari
 *
 *
 *
 *
 *         Method overriding is one of the ways in which Java supports Runtime
 *         Polymorphism. In other words, If the subclass has the same methods
 * 
 *         The method has the same name in the parent class The method has the
 *         same parameter in the parent class There must be an IS-A relationship
 *         (Inheritance)
 */

public class MethodOverriding extends ChildOverriding2 {

	public static void main(String[] args) {

		ChildOverriding2 child2 = new ChildOverriding2();
		child2.child();
	}

}
