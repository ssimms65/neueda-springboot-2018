package uk.ac.belfastmet.passengers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.passengers.repository.PassengersRepository;

@Controller
@RequestMapping("")
public class ViewPassengersController {

	
	PassengersRepository passengersRepository;

	public ViewPassengersController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}
	
	
	@GetMapping("/view/{passengers.passengerId}")
	public String viewPassengers(@PathVariable("passengers.passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View");
		model.addAttribute("passengers", this.passengersRepository.findAll());
		return "viewPassengers";
	
	}
	
}
