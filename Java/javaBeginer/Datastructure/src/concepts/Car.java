package concepts;

public class Car extends Vehicle{
// if we inherit the abstract class and if there is any abstract method in class that should be utilized too or else it will give error.
	@Override
	void display() {
		// TODO Auto-generated method stub
	System.out.println("This is used to override the abstract method and wirte the body in child class.");	
	}
	
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
// Copy Constructor
	Car(Car c){
		this.copy(c);
		
	}
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
//	this method is used to copy object
	public void copy(Car c) {
		this.setMake(c.make);
		this.setModel(c.model);
		this.setYear(c.year);
		
		
	}
}
