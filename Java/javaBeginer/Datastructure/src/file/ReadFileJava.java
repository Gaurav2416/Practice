package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*read the content of the file as the stream of Character. One by one read returns an int value which contains byte value.
		 * when read() returns -1 then there is no data*/
		try {
			FileReader reader = new FileReader("javaWriteFile.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read(); // read the next character
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
