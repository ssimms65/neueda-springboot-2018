package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/tolkien")
	
public class TolkienController {
		
	DwarfRepository dwarfRepository;

	public TolkienController (DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	
	@GetMapping("")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien");
		model.addAttribute("dwarfs", this.dwarfRepository.findByAuthor("Tolkien"));
		return "dwarf";
	}
		
}
