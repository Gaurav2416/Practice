package concepts;

public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("Hunt the smaller fish");
	}

	@Override
	public void flee() {
		// TODO Auto-generated method stub
		System.out.println("Flee for larger fish");
	}
	

}
