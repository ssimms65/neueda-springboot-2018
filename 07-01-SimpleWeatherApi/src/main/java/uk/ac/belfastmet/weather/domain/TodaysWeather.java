package uk.ac.belfastmet.weather.domain;

import lombok.Data;

@Data //That's where lombok comes in, it does constructors and getters and setters but
	//it confuses eclipse because during compiler code it needs that information. 
	//Use eclipse plug-in - Google project lombok and install the plug-in
public class TodaysWeather {
	
	private Location location;
	private Weather weather;
	
	public String toString() {
		
		String location = "\n" + this.location.getName() + ", "
							   + this.location.getLatitude() + ", "
							   + this.location.getLongitude() + "\n ";
		
		String weather = this.weather.getDescription() + ", "
				+ this.weather.getDescription() + ", "
				+ this.weather.getPrecipitation() + ", "
				+ this.weather.getTemperature() + ", "
				+ this.weather.getHumidity() + ", "
				+ this.weather.getPressure() + ", "
				+ this.weather.getCloudCover() + ", "
				+ this.weather.getWind() + ", "
				+ this.weather.getImage() + ", "
				;
 		return location + weather; //this is for testing 
 	}
	
	//Need to map wind!
}
