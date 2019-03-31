package practicse.java;

import java.util.HashMap;

public class RestaurantForEac {

	public static void main(String[] args) {
		HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

		restaurantMenu.put("Turkey Burger", 13);
		restaurantMenu.put("Naan Pizza", 11);
		restaurantMenu.put("Cranberry Kale Salad", 10);

		//.out.println(restaurantMenu.size());

for (String item:restaurantMenu.keySet() ) {

			//System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");
			System.out.println(restaurantMenu.keySet() );
			System.out.println(restaurantMenu.get(item));

		}

	}

	}


