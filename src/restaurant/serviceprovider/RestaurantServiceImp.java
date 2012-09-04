package restaurant.serviceprovider;

import java.util.Map;

public class RestaurantServiceImp implements RestaurantService {

	private RestaurantDataSource restDataSrc;
	private Map<String, Restaurant> restData;

	public void init() {
		restData = restDataSrc.getAllRestaurants();
	}

	@Override
	public String getAddress(String name) {
		return restData.get(name).getAddress();
	}

	@Override
	public void applyMember(String name, String customer) {
		restData.get(name).addMember(customer);
	}

	@Override
	public boolean isMember(String name, String customer) {
		return restData.get(name).isMember(customer);
	}

	public void setRestDataSrc(RestaurantDataSource restDataSrc) {
		this.restDataSrc = restDataSrc;
	}
}
