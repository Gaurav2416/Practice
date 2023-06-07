package oop;
class Work{

	Work() {
		// TODO Auto-generated constructor stub
	System.out.println("This is defualt constructor with no param. Automatically called when the object is created");
	}
	Work(int a, int b){
		int sum = a + b;
		System.out.println("Print the sum of the param passed using constructor is " + sum);
	}
	String name;
	int sal;
	Work(String name,int sal){
		this.name = name;
		this.sal = sal;
	}
	void display() {
		System.out.println(this.name + " Is searching job");
	}
}
public class ConstructorMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Work(); // Default constructor call
	System.out.println("New call with param");
	new Work(2,3);
	System.out.println("New call with overlaod and this and setting the variable in the class");
	Work w = new Work("Gaurav",0);
	System.out.println("Name = " + w.name);
	System.out.println("Salary = " + w.sal);
	w.display();
	}

}
