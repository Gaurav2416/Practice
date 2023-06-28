package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serializer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Serializable: The process of converting a object into byte stream.
		 * 				Persist(save the state) the object after the program exits
		 * 				This byte stream can be saved as a file or sent over a network
		 * 				can be sebt to a different machine
		 * 				Byte stream can be saved as a file(.ser)which is platform independent 
		 * 				(Think of this as if you are saving file with the object information)
		 * 
		 * Deserialization: The reverse process of converting a byte stream into an object.
		 * 					(Think of this as if you are loading a saved file)
		 * */
		//-----------------------------------------------------------------------------------------
		/*Steps for Serialize
		 * 1. Your object class should implement Serializable interface
		 * 2. Add import java.io.Serializable
		 * 3. FileOutputStream fileOut =  new FileOuputStream(file path)
		 * 4. ObjectOutputStream out  = new ObjectOutputStream(fileOut);
		 * out.writeObject(objectName);
		 * out.close();
		 * fileOut.close();*/
		Userss u =  new Userss();
		u.name = "Taneja";
		u.password = "abcd";
		FileOutputStream fileOut = new FileOutputStream("Userinfo.ser");
		ObjectOutputStream out  = new ObjectOutputStream(fileOut);
		out.writeObject(u);
		out.close();
		fileOut.close();
		System.out.println("Object Saved!!!");
	}

}
