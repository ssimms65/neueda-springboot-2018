package uk.ac.belfastmet.sasha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("")
	public String home(Model model) {
		return "index.html";
	}
	
}
