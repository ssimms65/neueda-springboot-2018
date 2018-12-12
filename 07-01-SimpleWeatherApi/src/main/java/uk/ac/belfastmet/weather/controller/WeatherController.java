package uk.ac.belfastmet.weather.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domain.TodaysWeather;


@Controller
@RequestMapping("")
public class WeatherController {
	
	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("/weather/{location}")
	public String belfast(@PathVariable("location") String Location, Model model) {
		
		//build for Belfast first
		String belfastWeatherUrl=
				"http://www.codingfury.net/training/weathersample/weather.hpp?location=belfast";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather	= restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class); 
		
		//slf4j
		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
		logger.info(todaysWeather.toString());
		
		model.addAttribute("todaysWeather", todaysWeather);
		return "weather";
		
		//We are going to need to put this in the service
	}


}
