package uk.ac.belfastmet.sasha.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.sasha.domain.People;
import uk.ac.belfastmet.sasha.service.PeopleService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping ("/pixar")
public class PixarController {

	@GetMapping("")
	public String pixar(Model model) {
	
	PeopleService peopleService = new PeopleService();
	ArrayList<People> pixarPeople = peopleService.getPixarPeoples();
	
	
	model.addAttribute("pageTitle", "Pixar");
	model.addAttribute("pixarPeople", pixarPeople);
	return "pixar";
	
	}
}