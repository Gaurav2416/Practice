package concepts;
class Animal{
	String name;
	String type;
	String category;
	
	void setAttributes(String name, String type,String category) {
		this.name = name;
		this.type = type;
		this.category = category;
	}
	void demo() {
		System.out.println("This is to practice method overidding");
	}
}
class Birds extends Animal{
	void display() {
		System.out.println("The " + name + " is a " + type + " of category " + category);
	}
	@Override
	void demo() {
		System.out.println("The method demo is overidden method of class Animal ");
	}
}
public class InheritanceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Birds b = new Birds();
		b.setAttributes("Parrot", "Bird", "Fly");
		b.display();
		Animal a = new Animal();
		a.demo();
		b.demo();
		
	}

}
