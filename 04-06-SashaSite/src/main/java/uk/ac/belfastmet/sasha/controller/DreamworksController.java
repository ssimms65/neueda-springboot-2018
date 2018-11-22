package uk.ac.belfastmet.sasha.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.sasha.domain.People;
import uk.ac.belfastmet.sasha.service.PeopleService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping ("/dreamworks")


public class DreamworksController {

	@GetMapping("")
	public String dreamworks(Model model) {
	
	PeopleService peopleService = new PeopleService();
	ArrayList<People> dreamworksPeople = peopleService.getDreamworksPeoples();
	
	
	model.addAttribute("pageTitle", "Dreamworks");
	model.addAttribute("dreamworksPeople", dreamworksPeople);
	return "dreamworks";
	
	}
}