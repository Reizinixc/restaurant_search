package restaurant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author kunemata
 * @version 1.0
 */
public class RestaurantClient {
	
	private RestaurantService restService;
	
	public RestaurantClient() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("rest-client-config.xml");
		restService = (RestaurantService) ac.getBean("restService");
	}
	
	public String getAddress(String name) {
		return restService.getAddress(name);
	}
	
	public void applyMember(String name, String customer) {
		restService.applyMember(name, customer);
	}
	
	public boolean isMember(String name, String customer) {
		return restService.isMember(name, customer);
	}
}
