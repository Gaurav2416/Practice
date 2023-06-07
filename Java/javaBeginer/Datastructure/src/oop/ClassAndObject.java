package oop;
class Demo{
	void display() {
		System.out.print("Hello");
	}
	static void out() {
		System.out.println("\tWorld");
	}
	void name(String inName) {
		System.out.println("My name is = " + inName );
	}
	int totalMarks(int x, int y) {
		return x + y;
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d =  new Demo();
		d.display();
		Demo.out(); // class and the method name is used instead using the object of the class as in other call of methods
		d.name("Gaurav");
		int totalMarks  = d.totalMarks(12, 14);
		System.out.printf("My total Marks is %d" ,totalMarks);
		
//		new .java file call class
		System.out.println("\n\nNew class in new file practice");
		Car c = new Car();
		c.details();
		System.out.println("\nThe total cost of both the cars are " + c.changeDetails("Audi", 100000));
	}

}
