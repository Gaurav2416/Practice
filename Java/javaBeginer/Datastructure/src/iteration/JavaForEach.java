package iteration;

import java.util.ArrayList;

public class JavaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Gaurav","Kunal","Nalini"};
		System.out.println(names);
		for (String name : names) {
			System.out.print(name);
		}
		// Using with collections
		System.out.println();
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Elephant");
		System.out.println(animals);
		for (String name : animals) {
			System.out.print(name);
		}
	}

}
