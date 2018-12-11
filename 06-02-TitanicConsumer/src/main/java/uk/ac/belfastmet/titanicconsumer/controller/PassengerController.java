package uk.ac.belfastmet.titanicconsumer.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerServiceImpl;

@Controller
@RequestMapping("/titanic")
public class PassengerController {

	@Autowired
	PassengerServiceImpl passengerService; // Change to implementation (Impl)
	AllPassengers allPassengers;

	// Constructors
	public PassengerController() {
		super();
	}

	public PassengerController(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;
	}

	public PassengerController(PassengerServiceImpl passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}

	@GetMapping("")
	public String listPassengers(Model model) {

		model.addAttribute("pageTitle", "View Passenger");
		ArrayList<Passenger> passengers = this.passengerService.list();
		model.addAttribute("passengers", passengers);

		return "passengers";
	}

	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {

		model.addAttribute("pageTitle", "View Passenger");

		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);

		return "viewPassenger";
	}

	@GetMapping("/add/")
	public String addPassenger(Model model) {
		model.addAttribute("pageTitle", "Add Passenger");

		Passenger passenger = new Passenger();
		model.addAttribute("passenger", passenger);

		return "editPassenger";

	}

	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {

		model.addAttribute("pageTitle", "View Passenger");

		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);

		return "editPassenger";
	}

	@PostMapping("/save/")public String save(Passenger passenger, @RequestParam("addUpdate")
	String addUpdate, Model model) {
	
	if(addUpdate.equals("Add Passenger")) {
		this.passengerService.add(passenger);
		return "redirect:/titanic";
	} else {
		this.passengerService.update(passenger);
		return "redirect:/titanic/view/" + passenger.getPassengerId();
		}
	}
}
