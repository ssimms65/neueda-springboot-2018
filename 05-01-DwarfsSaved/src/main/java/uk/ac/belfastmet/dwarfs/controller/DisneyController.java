package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
	@RequestMapping("/disney")

public class DisneyController {
	
	DwarfRepository dwarfRepository;
	
	public DisneyController (DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	
	@GetMapping("")
	public String disney(Model model) {
		model.addAttribute("pageTitle", "Disney");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor("Disney"));
		return "dwarf";
	}

}
