package oop;

public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Need write toString method in the class which object is used to call toString. And the method should have return.
		 * The method can be used implicitly and explicitly */
		Car c = new Car(); 
		System.out.println(c.toString()); // explicit
		System.out.println(c); // implicit
	}

}
