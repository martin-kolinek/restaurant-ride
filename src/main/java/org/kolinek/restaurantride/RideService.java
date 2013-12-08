package org.kolinek.restaurantride;

import java.util.Date;

import javax.jws.WebService;

@WebService
public interface RideService {
	void reserveRide(int numberOfPeople, Date date);
}
