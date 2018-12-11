package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

//public interface PassengerServiceImpl extends PassengerService {

@Service
public class PassengerServiceImpl implements PassengerService {

	@Value("${api.passenger.url}")
	private String apiUrl; // Getting value from this

	private RestTemplate restTemplate;

	
	public PassengerServiceImpl(String passengerUrl, RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	public ArrayList<Passenger> list() {

		String listPassengerUrl = this.apiUrl + "/passengers";

		AllPassengers allPassengers = this.restTemplate.getForObject(listPassengerUrl
				, AllPassengers.class);

		return allPassengers.getAllPassengers();

	}

	public Passenger get(Integer passengerId) {

	String getPassengerUrl = this.apiUrl + "/passengers/" + passengerId;
	

		Passenger passenger = 
				this.restTemplate.getForObject(getPassengerUrl, Passenger.class);

		return passenger;
	}

	public Passenger add(Passenger passenger) {
		
		String addPassengerUrl = this.apiUrl + "/passengers/" + passenger.getPassengerId();
		
		this.restTemplate.postForObject(addPassengerUrl, passenger, Passenger.class);
		return null;	

	}

	public Passenger update(Passenger passenger) {
		
		String updatePassengerUrl = this.apiUrl + "/passengers/" + passenger.getPassengerId();
		
		this.restTemplate.put(updatePassengerUrl, passenger, Passenger.class);
		return passenger;

	}

	public void delete(Integer passengerId) {
		
	//	String deletePassengerUrl = this.apiUrl + "/passengers/" + passengerId;
		
	//	Passenger passenger = 
			//	this.restTemplate.delete(deletePassengerUrl, Passenger.class);

		//return passenger;
	}
}
