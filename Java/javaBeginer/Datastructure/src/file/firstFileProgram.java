package file;

import java.io.File;

public class firstFileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("myFirstProgram.txt");
		
		if(file.exists()) {
			System.out.println("File exists!!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			file.delete();
		}else {
			System.out.println("Not exist!!");
		}
	}

}
