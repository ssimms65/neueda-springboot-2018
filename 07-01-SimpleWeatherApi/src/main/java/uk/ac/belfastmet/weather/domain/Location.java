package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data
public class Location {
	
	private String name;
	private Float latitude;
	private Float longitude;
	
	public String toString() {

		//Moved from TodaysWeather class so each class controls it's toString
		
		String location = "\n" + this.getName() + ", "
							   + this.getLatitude() + ", "
							   + this.getLongitude() + "\n ";

		return location;
	}
}
//Correct
