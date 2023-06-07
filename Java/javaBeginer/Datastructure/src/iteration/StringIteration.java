package iteration;

public class StringIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hello World";
		for(int i = 0; i < word.length();i++) {
			char ch = word.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		for(char ch:word.toCharArray()) {
			System.out.print(ch);
		}
	}

}
