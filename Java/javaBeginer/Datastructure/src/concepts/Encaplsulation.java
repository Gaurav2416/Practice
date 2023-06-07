package concepts;

public class Encaplsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The encapsulation method getter and setter are used to access the private attributes.
	Car c =  new Car("Chev","X1",1234);

	System.out.println();
	System.out.println(c.getMake());
	System.out.println(c.getModel());
	System.out.println(c.getYear());
	c.setMake("Audi");
	c.setModel("Q7");
	c.setYear(1824);
	System.out.println("\nAfter Using setter");
	System.out.println(c.getMake());
	System.out.println(c.getModel());
	System.out.println(c.getYear());
	
	/*Copy Object*/
	
	Car c1 =  new Car("A","B",3456);
//	c1 = c;  this statement will point to same memory address of object.
	System.out.println("\nthe object before copy");
	System.out.println(c1);
	System.out.println(c);
	System.out.println(c1.getMake());
	System.out.println(c1.getModel());
	System.out.println(c1.getYear());
	
	System.out.println();
	c1.copy(c);
	System.out.println("the object after copy");
	System.out.println(c1);
	System.out.println(c);
	System.out.println(c1.getMake());
	System.out.println(c1.getModel());
	System.out.println(c1.getYear());
	
//	Car Copy constructor
	Car c2 = new Car(c);
	System.out.println("\nthe copy constructor");
	System.out.println(c2);
	System.out.println(c2.getMake());
	System.out.println(c2.getModel());
	System.out.println(c2.getYear());
	}

}
