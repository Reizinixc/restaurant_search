package restaurant.test;

import restaurant.client.RestaurantClient;

public class RestaurantClientTestMain {

	public static void main(String[] args) {

		RestaurantClient client = new RestaurantClient();

		// ---------- test 1 --------------
		String addressTest1 = client.getAddress("Aroi");
		if ("Bangkhen".equals(addressTest1))
			System.out.println("Address Test 1 Passed");
		else
			System.out.println("Address Test 1 Failed");

		// ---------- test 2 --------------
		String addressTest2 = client.getAddress("Lily");
		if ("Jatujak".equals(addressTest2))
			System.out.println("Address Test 2 Passed");
		else
			System.out.println("Address Test 2 Failed");

		// ---------- test 3 --------------
		client.applyMember("Garden", "Usa");
		if (client.isMember("Garden", "Usa"))
			System.out.println("Member Test 1 Passed");
		else
			System.out.println("Member Test 1 Failed");
		
		// ---------- test 4 --------------
		if (!client.isMember("Garden", "Nobody"))
			System.out.println("Member Test 2 Passed");
		else
			System.out.println("Member Test 2 Failed");

	}
}
