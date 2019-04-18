package com.abstraction;

abstract class Shape {
	String color;
	
	abstract double area();
	public abstract String toString();
    
//	abstract class can have constructor
	public Shape(String color) {
		System.out.println("Shape Constructor Called...");
		this.color = color;
	}
	
//	this is called concrete method
	public String getColor() {
		return color;
	}
	/*public void setColor(String color) {
		this.color = color;
	}*/
}

class Circle extends Shape {

	double radious;

	public Circle(String color, double radious) {
		super(color);
		System.out.println("Super Constructor Called...");
		this.radious = radious;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radious, 2); 
	}

	@Override
	public String toString() {
		return "Circle color is " +"{ "+ super.color +" }"+" and area is : " + area(); 
	}
		
}

class Rectangle extends Shape {

	double length;
	double width;
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called"); 
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		
		return length * width;
	}

	@Override
	public String toString() {
		
		return "Rectangle color is "+ "{ " + super.color + " }" + 
				" and area is : " + area(); 
	}
	
}

public class AbstractionExample {
	public static void main(String args[]) {
		
		Shape s1 = new Circle("Red", 2.2);
		System.out.println("Shape Class Called : " + s1.toString());
		
		Shape s2 = new Rectangle("Blue", 2, 4); 
		System.out.println("Rectangle Class invoked : " + s2.toString());
	}
}
