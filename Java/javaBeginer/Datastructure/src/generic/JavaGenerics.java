package generic;

public class JavaGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * generics = enable type(classes or interfaces) to be parameters when defining
		 * classes,interface, and methods.
		 * a benefit is to eliminate the need to create multiple version
		 * of method or classes for the various data types. Use version for all reference data type. 
		 * Need to use wrapper class for declaration
		 * Example : To use when multiple classes try to access same method.*/
		
		Integer[] intArray = {1,2,3,4,5}; 
		String[] stringArray = {"a","b","c","d","e"};
		dispaly(intArray);
		dispaly(stringArray);
		System.out.println(returnFirstEelemnt(intArray));
		System.out.println(returnFirstEelemnt(stringArray));
	}
		
	public static <T> void dispaly(T[] array){
	  for(T a:array) {
		  System.out.print(a);
	  }	
	  System.out.println();
	}
	public static <T> T returnFirstEelemnt(T[] array){
		  return array[0];
		}

}
