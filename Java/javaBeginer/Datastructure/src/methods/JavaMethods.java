package methods;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display("Gaurav",28);
		int sum = add(12,13);
		System.out.println("Addition = "+sum);
	}
	static void display(String name,int age) {
		System.out.println("Hello " + name + " age is " + age);
	}
	static int add(int x, int y) {
		return x + y;
	}
}
