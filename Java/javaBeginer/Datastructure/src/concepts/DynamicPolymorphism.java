package concepts;

import java.util.Scanner;

class Animals{
	void speak() {
		System.out.println("animal can make noises");
	}
}
class Dog extends Animals{
	@Override
	void speak(){
		System.out.println("Bark");
	}
}
class Cat extends Animals{
	@Override
	void speak() {
		System.out.println("Meow");
	}
}
public class DynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		dynamic =  is after the compilation(during runtime)
	Scanner sc = new Scanner(System.in);
	System.out.println("What animal do you want?");
	System.out.println("1 = dog or 2 = cat");
	int choice = sc.nextInt();
	Animals a;
	if (choice == 1) {
		a = new Dog();
		a.speak();
	}else if (choice == 2) {
		a = new Cat();
		a.speak();
	}else {
		a = new Animals();
		a.speak();
	}
	sc.close();
	}

}
