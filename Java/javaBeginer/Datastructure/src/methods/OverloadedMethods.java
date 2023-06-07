package methods;

public class OverloadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOne = add(12,13);
		int sumTwo = add(12,13,14);
		double sumThree = add(12.2,13.3);
		System.out.println("Sum of first method with two param = " + sumOne);
		System.out.println("Sum of second method with three param = "+ sumTwo);
		System.out.println("Sum of third method with double data type param = "+ sumThree);
	} 
	//Overload method
	static int add(int x, int y){
		return x + y;
	}
	static int add(int x, int y, int z) {
		return x + y + z;
	}
	static double add(double x, double y){
		return x + y;
	}
	

}
