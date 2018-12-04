package uk.ac.belfastmet.passengers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.passengers.repository.PassengersRepository;

@Controller
@RequestMapping("/passengers")

public class PassengerController {
	
	PassengersRepository passengerRepository;

	public PassengerController(PassengersRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("")
	public String passengers(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengerRepository.findByPassengerId(1));
		return "passenger";
	
	}
	
	
}
