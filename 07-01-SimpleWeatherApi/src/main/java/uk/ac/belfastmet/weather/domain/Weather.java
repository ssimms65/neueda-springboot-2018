package uk.ac.belfastmet.weather.domain;

import java.util.Map;

import lombok.Data;

@Data
public class Weather {
	
	private String description;
	private String precipitation;
	private Integer temperature;
	private String humidity;
	private Integer pressure;
	private Integer cloudCover; 
	private Map<String, Object> wind; //Object... but for now it's a map
	private String image;
	
	

}
