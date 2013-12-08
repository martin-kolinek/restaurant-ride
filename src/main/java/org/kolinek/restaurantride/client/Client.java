package org.kolinek.restaurantride.client;

import java.util.Calendar;

import org.kolinek.restaurantride.RideService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

	public static void main(String args[]) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"client-context.xml");

		RideService client = context.getBean("client", RideService.class);

		Calendar cal = Calendar.getInstance();
		cal.set(2013, 12, 8, 9, 0);
		client.reserveRide(10, cal.getTime());
		LOGGER.info("reserved ride");
		context.close();
		System.exit(0);
	}
}
