import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WHILE LOOP
		
		Scanner sc =  new Scanner(System.in);
		String name = "";
		 while(name.isBlank()) {
			 System.out.println("Enter you name ");
			 name =  sc.nextLine();
		 }
		 System.out.println("The name is " + name);
		 
		 // FOR LOOP
		 
		 for(int i = 0; i < 2; i++) {
			 System.out.println("My name "+i + " =" + name );
		 }
		 for(int i = 0; i <= 4; i+=2) {
			 System.out.println("My name "+i + " =" + name );
		 }
		 for(int i = 4; i >= 0; i-=2) {
			 System.out.println("My name "+i + " =" + name );
		 }
		 
		 // NESTED LOOP
		 
		 int row;
		 int col;
		 String symbol = "";
		 
		 System.out.println("Enter number of row");
		 row = sc.nextInt();
		 System.out.println("Enter number of columns");
		 col = sc.nextInt();
		 System.out.println("Enter symbol");
		 symbol = sc.next();
		 
		 for(int i = 1; i <= row; i++ ) {
			 System.out.println();
			 for(int j = 1; j <= col; j++) {
				 System.out.print(symbol);
			 }
		 }
	}

}
