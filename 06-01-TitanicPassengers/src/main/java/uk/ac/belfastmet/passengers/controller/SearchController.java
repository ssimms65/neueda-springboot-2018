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
		return "passengers";
	}
	
	@GetMapping("/searchsurvived")
	public String searchSurvived(@RequestParam("survived") Integer survived, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findBySurvived(survived));
		return "passengers";
	}
	
	@GetMapping("/searchpClass")
	public String searchPClass(@RequestParam("pClass") Integer pClass, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByPClass(pClass));
		return "passengers";
	}
	
	@GetMapping("/searchname")
	public String searchName(@RequestParam("name") String name, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByName(name));
		return "passengers";
	}
	
	@GetMapping("/searchsex")
	public String searchSex(@RequestParam("sex") String sex, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findBySex(sex));
		return "passengers";
	}
	
	@GetMapping("/searchage")
	public String searchAge(@RequestParam("age") Integer age, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByAge(age));
		return "passengers";
	}
	
	@GetMapping("/searchsibSp")
	public String searchSibSp(@RequestParam("sibSp") Integer sibSp, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findBySibSp(sibSp));
		return "passengers";
	}
	
	@GetMapping("/searchparch")
	public String searchParch(@RequestParam("parch") Integer parch, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByParch(parch));
		return "passengers";
	}
	
	@GetMapping("/searchticket")
	public String searchTicket(@RequestParam("ticket") Double ticket, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByTicket(ticket));
		return "passengers";
	}
	
	@GetMapping("/searchfare")
	public String searchFare(@RequestParam("fare") Double fare, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByFare(fare));
		return "passengers";
	}
	
	@GetMapping("/searchcabin")
	public String searchCabin(@RequestParam("cabin") Double cabin, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByCabin(cabin));
		return "passengers";
	}
	
	@GetMapping("/searchembarked")
	public String searchEmbarked(@RequestParam("embarked") String embarked, Model model) {
		model.addAttribute("pageTitle", "Search");
		model.addAttribute("passengers", this.passengerRepository.findByEmbarked(embarked));
		return "passengers";
	}
	
	
}
