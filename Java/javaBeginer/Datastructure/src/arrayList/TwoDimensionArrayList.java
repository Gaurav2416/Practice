package arrayList;

import java.util.ArrayList;

public class TwoDimensionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Dynamic list of list */
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		System.out.println("Bakery list = " + bakeryList);
		ArrayList<String> quantity = new ArrayList<String>();
		quantity.add("3");
		quantity.add("2");
		quantity.add("10");
		System.out.println("Quantity list = " + quantity);
		ArrayList<String> ingredient = new ArrayList<String>();
		ingredient.add("tomatoes");
		ingredient.add("garlic");
		ingredient.add("Sauce");
		System.out.println("Ingredient list = " + ingredient);
		ArrayList<ArrayList<String>> recipeList = new ArrayList<ArrayList<String>>();
		recipeList.add(bakeryList);
		recipeList.add(quantity);
		recipeList.add(ingredient);
		System.out.println("All recipelist are = " + recipeList);
	
		}

}
