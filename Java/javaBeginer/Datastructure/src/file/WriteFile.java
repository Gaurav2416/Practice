package file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("javaWriteFile.txt");
	writer.write("Roses are red \n Writing new line");
	writer.append("\nA poem by me");
	writer.close();
}
}
