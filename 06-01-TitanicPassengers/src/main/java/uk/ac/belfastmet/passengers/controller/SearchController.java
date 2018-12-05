package uk.ac.belfastmet.passengers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.passengers.repository.PassengersRepository;

@Controller
@RequestMapping("")

public class SearchController {
		
	PassengersRepository passengerRepository;

	public SearchController(PassengersRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("/searchpassengerid")
	public String searchPassengerId(@RequestParam("passengerid") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByPassengerId(passengerId));
		return "passengersPage";
	}
	
	@GetMapping("/searchsurvived")
	public String searchSurvived(@RequestParam("survived") Integer survived, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findBySurvived(survived));
		return "passengersPage";
	}
	
	@GetMapping("/searchpClass")
	public String searchPClass(@RequestParam("pClass") Integer pClass, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByPClass(pClass));
		return "passengersPage";
	}
	
	@GetMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByName(name));
		return "passengersPage";
	}
	
	@GetMapping("/searchsex")
	public String searchSex(@RequestParam("sex") String sex, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findBySex(sex));
		return "passengersPage";
	}
	
	@GetMapping("/searchage")
	public String searchAge(@RequestParam("age") Integer age, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByAge(age));
		return "passengersPage";
	}
	
	@GetMapping("/searchsibSp")
	public String searchSibSp(@RequestParam("sibSp") Integer sibSp, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findBySibSp(sibSp));
		return "passengersPage";
	}
	
	@GetMapping("/searchparch")
	public String searchParch(@RequestParam("parch") Integer parch, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByParch(parch));
		return "passengersPage";
	}
	
	@GetMapping("/searchticket")
	public String searchTicket(@RequestParam("ticket") String ticket, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByTicket(ticket));
		return "passengersPage";
	}
	
	@GetMapping("/searchfare")
	public String searchFare(@RequestParam("fare") String fare, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByFare(fare));
		return "passengersPage";
	}
	
	@GetMapping("/searchcabin")
	public String searchCabin(@RequestParam("cabin") String cabin, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByCabin(cabin));
		return "passengersPage";
	}
	
	@GetMapping("/searchembarked")
	public String searchEmbarked(@RequestParam("embarked") String embarked, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByEmbarked(embarked));
		return "passengersPage";
	}
	
	
}
