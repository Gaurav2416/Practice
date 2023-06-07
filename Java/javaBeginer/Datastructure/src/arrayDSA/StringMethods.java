package arrayDSA;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello";
		boolean check = name.equals("hello");
		System.out.println("Check if String are same =" + check);
		System.out.println("Make comparison not case sensitive = " + name.equalsIgnoreCase("hello"));
		System.out.println("Length of the string is " + name.length());
		System.out.println("Character at index 3 = " + name.charAt(3));
		System.out.println("Index of char l = " + name.indexOf("l"));
		System.out.println("Is Empty check = "+ name.isEmpty());
		System.out.println("Is blank check = " + name.isBlank());
		System.out.println("Uppercase = " + name.toUpperCase());
		System.out.println("Remove empty space = " + name.trim());
		System.out.println("Replace a character = " + name.replace("o","g"));
	}

}
