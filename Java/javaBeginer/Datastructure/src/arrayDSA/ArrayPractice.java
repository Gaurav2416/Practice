package arrayDSA;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"A","B", "C"};
		for(int i=0; i < cars.length;i++) {
			System.out.println(cars[i]);	
		}
		
		String[] names = new String[3];
		names = cars.clone();
		System.out.println("THe loop of names");
		for(int i = 0; i< names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		
		
	}

}
