package concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
//		good practice to write the each exception and at last may use exception 
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the whole number");
		int x = sc.nextInt();
		System.out.println("The number to divide the whole number");
		int y = sc.nextInt();
		System.out.println("Result= " + (x/y));
	
		}catch(ArithmeticException e) {
			System.out.println("The number cant be divided by zero " + e);
		}catch (InputMismatchException e) {
			System.out.println("Please enter a number "+ e);
		}catch(Exception e) {
			System.out.println("The error occurred is " + e);
		}finally {
			sc.close();
			System.out.println("This will finally print");
		}
		
	}

}
