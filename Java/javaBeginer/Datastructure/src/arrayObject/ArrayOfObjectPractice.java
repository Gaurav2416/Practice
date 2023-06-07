package arrayObject;

public class ArrayOfObjectPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food[] ref = new Food[3];
		Food item1 = new Food("pizza", 1);
		Food item2 = new Food("Burger", 2);
		Food item3 = new Food("Salad", 3);
		
		ref[0] = item1;
		ref[1] = item2;
		ref[2] = item3;
		
		System.out.println("Name= "+ref[0].name+"\tQunatity= "+ref[0].quantity);
		System.out.println("Name= "+ref[1].name+"\tQunatity= "+ref[1].quantity);
		System.out.println("Name= "+ref[2].name+"\tQunatity= "+ref[2].quantity);
		
		System.out.println("New assinment of array and object");
		Food items1 = new Food("pizza", 1);
		Food items2 = new Food("Burger", 2);
		Food items3 = new Food("Salad", 3);
		Food items4 = new Food("Aloo", 4);
		Food[] refDy = {items1,items2,items3,items4};
		for(int i = 0; i < refDy.length;i++) {
			System.out.println("Name= "+refDy[i].name+"\tQunatity= "+refDy[i].quantity);
		}
	}

}
