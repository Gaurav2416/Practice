package generic;
class MyGeneric<T>{
	T x;
	MyGeneric(T x){
		this.x = x;
	}
	T getvalue(){
		return x;
	}
}
class MultipleGenricParamClass<K,V>{
	K key;
	V value;
	
	public MultipleGenricParamClass(K key,V value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
	}
	K getKey() {
		return this.key;
	}
	V getValue() {
		return this.value;
	}
	
}
public class GenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generic Class
				/*Example : ArrayList is type of Generic class we declare ArrayList<String> e = new ArrayList<>();
				 * When sending multiple data type we can add. HashMap<K,V> a = new HashMap<>(); */
				System.out.println("Generic class");
				MyGeneric<Integer> e = new MyGeneric<>(1);
				System.out.println(e.getClass());
				MyGeneric<String> s = new MyGeneric<>("a");
				System.out.println(s.getClass());
				System.out.println("\n Multiple parameter");
				MultipleGenricParamClass<Integer, String> a = new MultipleGenricParamClass<>(1, "Gaurav");
				System.out.println("\nType One Int and String");
				System.out.println(a.getKey());
				System.out.println(a.getValue());
				MultipleGenricParamClass<Double, String> b = new MultipleGenricParamClass<>(10.2, "Gaurav");
				System.out.println("\nType Two Double and String");
				System.out.println(b.getKey());
				System.out.println(b.getValue());
			}
	}


