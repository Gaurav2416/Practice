package oop;
class Garage{
	
	void display(Car car) {
		System.out.printf("The car parked is %s. The cost of the car is %d ",car.name,car.cost);
	}
}
public class PassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Garage g =  new Garage();
		g.display(car);
	}

}
