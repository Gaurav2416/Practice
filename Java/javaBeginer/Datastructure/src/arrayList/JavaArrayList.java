package arrayList;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Array List: this is resizeable array. elements can be add and removed after compilation.
		 * Store reference data types*/
		ArrayList<Integer>  a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		for (int i = 0; i < a.size();i++) {
			System.out.print(a.get(i)+ "\t");
		}
		a.set(3, 20);
		System.out.println();
	
		for (int i = 0; i < a.size();i++) {
			System.out.print(a.get(i)+ "\t");
		}
		a.remove(3);
		System.out.println();
		for (int i = 0; i < a.size();i++) {
			System.out.print(a.get(i)+ "\t");
		}
		a.clear();
		System.out.println();
		for (int i = 0; i < a.size();i++) {
			System.out.print(a.get(i)+ "\t");
		}
	}

}
