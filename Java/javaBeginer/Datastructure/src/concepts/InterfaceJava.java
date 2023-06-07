package concepts;

public class InterfaceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* interface = is a template that can be applied to a class
 * similar to inheritance but specifies what class has/must do
 * class can apply more than one interface unlike inheritance is limited to 1 super class */
	Rabbit r = new Rabbit();
	r.flee();
	Hawk h = new Hawk();
	h.hunt();
	Fish f = new Fish();
	f.hunt();
	f.flee();
	}

}
