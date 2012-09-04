package restaurant.serviceprovider;

import java.util.Map;

/**
 * This interface allows user to retrieve all restaurant information
 * @author Usa Sammapun
 *
 */
public interface RestaurantDataSource {

	/**
	 * 
	 * @return A map of name to its restaurant information
	 */
	Map<String, Restaurant> getAllRestaurants();

}
