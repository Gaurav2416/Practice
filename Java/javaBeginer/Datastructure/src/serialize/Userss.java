package serialize;

import java.io.Serializable;

public class Userss implements Serializable{
	String name;
	String password;
	
	void display() {
		System.out.println("Hello " + name);
	}
}
