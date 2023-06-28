public class Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//expression = operand and operators
		// operands = values, variables, number, quantity
		// operators = + * - / %
		/* '%' gives the remainder and '/' gives the quotient */
		int f = 10;
		System.out.println("Value=" + f);
		f --;
		System.out.println("Decrement value = "+f); 
		f ++;
		int modulous = f % 3;
		double divide = (double)f / 2;
		System.out.println("Mod value "+f+" % 3 = " + modulous);
		System.out.println("Divide value "+f+" / 2 = "+ divide);
	}

}
