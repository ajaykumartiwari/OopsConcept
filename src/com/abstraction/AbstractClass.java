package com.abstraction;

abstract class Bike {
	
	// abstract class have constructor and final method
	@SuppressWarnings("static-access")
	public Bike() {
		long interval = 10000;
		System.out.println("Constructor invoked!");
		Thread t = new Thread();
		try {
			t.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	abstract void run();
	// Abstract class have abstract and non-abstract method.
	// Abstract class have 
	final void speed() {
	}
}
public class AbstractClass extends Bike{

	
	public AbstractClass() {
		// TODO Auto-generated constructor stub
		/*long interval = 10000;
		System.out.println("Constructor invoked!");
		Thread t = new Thread();
		try {
			t.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike  = new AbstractClass();
		bike.run();
		
		// abstract class cannot instantiated
		Bike b = new Bike() {
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				
			}
		};
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Bike is running!");
	}
}
