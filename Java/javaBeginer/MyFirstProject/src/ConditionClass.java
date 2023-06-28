import java.util.Scanner;

public class ConditionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the age ");
		int age = sc.nextInt();
		if (age >= 21 && age < 80) {
			System.out.println("You are able to drive at age " + age);
		}else if(age >= 80){
			System.out.println("You are too old");
		}else {
			System.out.println("You can drive after " + (21 - age) +" years." );
		}
		String s =  String.valueOf(age);
		switch(s) {
		case "21": System.out.println("Your age is " + age );
			break;
		default : System.out.println("Cant Drive");	
		}
	}

}
