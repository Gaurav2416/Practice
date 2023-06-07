package oop;

public class Car {
	String name = "Ford";
	final int cost = 40000;
	
	void details() {
		System.out.println("Name of the car is " + name + "cost of the car is " + cost );
	}
	int changeDetails(String n, int c) {
		System.out.println("The change details are below:");
		System.out.printf("The name of the car is %s",n);
		System.out.printf("\nThe cost of the car is %d",c);
		return c + cost;
	}
	// Method Used for toString
	public String toString() {
		return name + "\n" + cost;
	}
	
	
}
