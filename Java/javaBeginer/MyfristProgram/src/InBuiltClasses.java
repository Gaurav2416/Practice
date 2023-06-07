import java.util.Random;
import java.util.Scanner;

public class InBuiltClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = 10;
		Scanner sc = new Scanner(System.in); // Scanner class
		Random r = new Random(); // Random class
		System.out.println("Enter the first side");
		x = sc.nextDouble();
		System.out.println("Enter the Second side");
		y = sc.nextDouble();
		System.out.println("Hypotenuse is " + Math.sqrt((x*x)+(y*y)));
		sc.close();
		System.out.println("Some random values using random class = " + r.nextInt(6)); // random from 0 to 5 with limit 6 numbers
		
	}

}