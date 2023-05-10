import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("What is name?");
		String name = sc.next();
		System.out.println("What is age?");
		int age = sc.nextInt();
		System.out.println("what is food?");
		String food = sc.next();
		System.out.println("Age = " + age);
		System.out.println("My name is =\t" + name);
		System.out.println("Food = "+food);
	}

}
