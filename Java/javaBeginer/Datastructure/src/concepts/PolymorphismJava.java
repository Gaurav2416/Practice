package concepts;

class Vehicles{

	public void go() {
		// TODO Auto-generated method stub
		
	}
	
}
class Boat extends Vehicles{
	public void go() {
		System.out.println("The car is going");
	}
}
class Cars extends Vehicles{
	public void go() {
		System.out.println("The boat is going");
	}
}
public class PolymorphismJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Polymorphism is ability of the object to identify as one or more type*/
	Cars c = new Cars();
	Boat b = new Boat();
	Vehicles[] type = {c,b};
	for(Vehicles c1 : type) {
		c1.go();
	}
	}

}
