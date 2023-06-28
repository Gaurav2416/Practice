package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*Steps for Serialize
		 * 1. Your object class should implement Serializable interface
		 * 2. Add import java.io.Serializable
		 * 3. FileInputStream fileIn =  new FileInputStream(file path)
		 * 4. ObjectOutputStream out  = new ObjectOutputStream(fileOut);
		 * out.writeObject(objectName);
		 * out.close();
		 * fileOut.close();*/
		Userss u ; //different from serializer
		FileInputStream fileIn =  new FileInputStream("C:\\Users\\16824\\OneDrive\\Desktop\\Practice\\Java\\javaBeginer\\Datastructure\\Userinfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		u = (Userss) in.readObject();
		in.close();
		fileIn.close();
		u.display();
	}

}
