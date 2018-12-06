package uk.ac.belfastmet.passengers.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import uk.ac.belfastmet.passengers.domain.Passengers;
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
	
	@GetMapping("/view/{passengerId}")
	public String viewPassengers(@PathVariable("passengerId") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "View");
		model.addAttribute("passenger", this.passengersRepository.findByPassengerId(passengerId));
		return "viewPassengers";
	
	}
	
	@GetMapping("/add")
	public String addPassengers(Model model) {
		model.addAttribute("pageTitle", "Add");
		model.addAttribute("passenger", new Passengers());
		return "editPassenger";
		
	}
	
	
	@GetMapping("/edit/{passengerId}")
	public String editPassengers(@PathVariable Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Edit");
		model.addAttribute("passenger", this.passengersRepository.findByPassengerId(passengerId)); //Not supposed to be 1 - Look at Repository, wants integer
		return "editPassenger";
		
	}

	
	
	@PostMapping("/save")
	public String savePassenger(@Valid Passengers passenger, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors())
		{
			return "editPassenger";
		}else {
			Passengers savedPassenger = this.passengersRepository.save(passenger);
			return "redirect:/view/"+ savedPassenger.getPassengerId();
		}
		
	}
	
	
/*	

		
	
	
	@GetMapping("/delete/{passengerId}")
	public String viewPassengers(@PathVariable("passengerId") Integer passengerId, Model model, 
			RedirectAttributes redirectAttributes) {

		redirectAttributes.addFlashAttribute("message", "Successfully deleted passenger!");
		this.passengersRepository.deleteById(passengerId);
		return "redirect:/passengers";
		
		}*/
		
	}