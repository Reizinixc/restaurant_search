package restaurant.test;


import org.junit.Test;

import restaurant.client.RestaurantClient;
import static org.junit.Assert.*;

/**
 * A unit test script that test restaurant client functions
 * @author Usa Sammapun
 *
 */
public class RestaurantClientTestJUnit {

	RestaurantClient client = new RestaurantClient();
	
	/**
	 * Test getting address
	 */
	@Test
	public void address1() {
		assertEquals("Bangkhen", client.getAddress("Aroi"));
	}
	
	/**
	 * Test getting address
	 */
	@Test
	public void address2() {
		assertEquals("Jatujak", client.getAddress("Lily"));
	}
	
	/**
	 * Test applying member and checking whether it's actually registered
	 */
	@Test
	public void member1() {
		client.applyMember("Garden", "Usa");
		assertEquals(true, client.isMember("Garden", "Usa"));
	}
	
	/**
	 * Test to confirm the check return false when not a member
	 */
	@Test
	public void member2() {
		assertEquals(false, client.isMember("Garden", "Nobody"));
	}

}
