package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data //That's where lombok comes in, it does constructors and getters and setters but
	//it confuses eclipse because during compiler code it needs that information. 
	//Use eclipse plug-in - Google project lombok and install the plug-in

public class TodaysWeather {
	
	private Location location;
	private Weather weather;
	
	public String toString() {
		
		return location.toString() + weather.toString() + weather.getWind().toString();
			
		}
}

