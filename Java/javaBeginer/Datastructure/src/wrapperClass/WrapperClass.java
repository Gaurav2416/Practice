package wrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * primitive datatypes | wrapper data type
		 * int				   |  Integer
		 * boolean             | Boolean 
		 * double			   | Double
		 * char                | Character*/
		
		/*
		 * wrapper class converts the primitive to reference datatype. The String is always in reference data type.
		   reference data type have methods that can be used with collections.
		 * disadvantage is reference datatype are difficult to access than primitive data types.
		 * AutoBoxing : Java compiler make the conversion of primitive data type to their corresponding object wrapper class.
		 * */
		// Auto Boxing example
		Boolean a = true;
		Character symbol = '@';
		Integer number  = 1;
		Double fraction = 2.2;
		/* UnBoxing : the reverse of autoboxing. conversion of wrapper class to primitive. */
		//unboxing example
		if(a == true) {
			System.out.println("the value in variable is true");
		}
	}

}
