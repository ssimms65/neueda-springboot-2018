package uk.ac.belfastmet.passengers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.passengers.repository.PassengersRepository;

@Controller
@RequestMapping("")

public class PassengersController {
	
	PassengersRepository passengersRepository;

	public PassengersController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}

	@GetMapping("/passengers")
	public String passengers(Model model) {
		model.addAttribute("pageTitle", "Passengers");
		model.addAttribute("passengers", this.passengersRepository.findAll());
		return "passengersPage";
	
	}
	


}
