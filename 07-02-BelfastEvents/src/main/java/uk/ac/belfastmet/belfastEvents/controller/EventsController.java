package uk.ac.belfastmet.belfastEvents.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("")
public class BelfastEventsController {

	@GetMapping
	public String home() {
		return "home";
	}
	
//	@GetMapping("/belfastEvents/{event}")
//	public String belfast(@PathVariable("event") String event, Model model) {
//		
//		//build for Belfast first
//		String belfastEventsUrl=
//				"http://www.belfastcity.gov.uk/events/Event-95491.aspx" + event;
//				
//		
//		RestTemplate restTemplate = new RestTemplate();
//		TodaysWeather todaysWeather	= restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class); 
//		
//		//slf4j
//		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
//		logger.info(todaysWeather.toString());
//		
//		switch(event) {
//		case "london":
//		    model.addAttribute("pageTitle", "London");
//			break;
//		case "belfast":
//		    model.addAttribute("pageTitle", "Belfast");
//			break;
//		case "dublin":
//		    model.addAttribute("pageTitle", "Dublin");
//			break;
//
//		}
//		
//		
//		
//		model.addAttribute("todaysWeather", todaysWeather);
//		return "weather";
//		
//		//We are going to need to put this in the service
//	}
// 
	
}

