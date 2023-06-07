package oop;

import java.util.Random;

class Trial{
	Random r;
	int num;
	Trial(){
		r = new Random();
		Random rlocal =  new Random();
		int numlocal = 0;
		display();
	}
	void display() {
//	int	numlocal = rlocal.nextInt(6)+ 1;  local variable can be accessed outside the constructor
		num = r.nextInt(6) + 1;
		System.out.println("The random number is " + num);
	}
}
public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// local and global variable.
		Trial t =  new Trial();
	}

}
