package arrayDSA;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cars = {{"A","B","C"},{"1","2","3"},{"q","r"}};
		String [][] names = new String[3][3];
		names = cars.clone();
		for(int i = 0; i < cars.length;i++) {
			System.out.println();
			for(int j = 0; j < cars[i].length;j++) {
				System.out.print(cars[i][j] + "\t");
			}
		}
		System.out.println("\n");
		for(int i = 0; i < names.length;i++) {
			System.out.println();
			for(int j = 0; j < names[i].length;j++) {
				System.out.print(names[i][j] + "\t");
			}
		}
	}

}
