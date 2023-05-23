import java.util.Scanner;

public class InBuiltClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side");
		x = sc.nextDouble();
		System.out.println("Enter the Second side");
		y = sc.nextDouble();
		System.out.println("Hypotenuse is " + Math.sqrt((x*x)+(y*y)));
		
	}

}