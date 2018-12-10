package uk.ac.belfastmet.titanicconsumer.domain;

import java.util.ArrayList;

public class AllPassengers {

	private ArrayList<Passenger> allPassengers;
	
	public Passenger getPassengerWithId(Integer passengerId) {
		
		for (int i=0; i < this.allPassengers.size(); i++) {
			Passenger currentPassenger = this.allPassengers.get(i);
			if(currentPassenger.getPassengerId()==passengerId) {
				return currentPassenger;
			}
		}
		return null;
	}

	//Constructors
	public AllPassengers() {
		super();
	}

	public AllPassengers(ArrayList<Passenger> allPassengers) {
		super();
		this.allPassengers = allPassengers;
	}

	//Getters and Setters
	public ArrayList<Passenger> getAllPassengers() {
		return allPassengers;
	}

	public void setAllPassengers(ArrayList<Passenger> allPassengers) {
		this.allPassengers = allPassengers;
	}
	
	

	}


