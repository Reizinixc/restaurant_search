package restaurant.serviceprovider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RestaurantServiceProvider {

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("rest-server-config.xml");
		
		System.out.println("Server is ready!");
	}
}
