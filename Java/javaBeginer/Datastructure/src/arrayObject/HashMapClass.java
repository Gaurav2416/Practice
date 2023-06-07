package arrayObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Normal HashMap
		HashMap<String, Integer> dict = new HashMap<String,Integer>();
		dict.put("a",2);
		System.out.println("HashMap1" + dict);
		for(String name:dict.keySet()) {
			String key = name.toString();
			int val = dict.get(key);
			System.out.println("Key= "+key+"\tValue= "+val);
		}
		
		//Declaration
		HashMap<String, List<Integer>> json = new HashMap<String,List<Integer>>();
		json.put("b", Arrays.asList(1,2,3));
		System.out.println("HashMap2" + json);
		for(String name:json.keySet()) {
			String key = name.toString();
			 List<Integer> val = json.get(key);
			System.out.println("Key= "+key+"\tValue= "+val);
		}
		
		//New Declaration
		HashMap<String, ArrayList<Integer>> jsonNew = new HashMap<String,ArrayList<Integer>>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		jsonNew.put("c", c);
		
		System.out.println("HashMap3" + jsonNew);
		for(String name:jsonNew.keySet()) {
			String key = name.toString();
			 List<Integer> val = jsonNew.get(key);
			System.out.println("Key= "+key+"\tValue= "+val);
		}
		System.out.println("New display using foreach");
		jsonNew.forEach((key,val) -> System.out.println("Key= "+key+"\tValue= "+val));
		
		
	}

}
