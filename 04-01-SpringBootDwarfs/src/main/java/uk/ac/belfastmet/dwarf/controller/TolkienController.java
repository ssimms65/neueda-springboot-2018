package uk.ac.belfastmet.dwarf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.service.DwarfService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping ("/tolkien")


public class TolkienController {

	@GetMapping("")
	public String tolkien(Model model) {
	
	DwarfService dwarfService = new DwarfService();
	ArrayList<Dwarf> tolkienDwarfs = dwarfService.getTolkienDwarfs();
	
	
	model.addAttribute("pageTitle", "Tolkein!");
	model.addAttribute("tolkienDwarfs", tolkienDwarfs);
	return "tolkien";
	
	}
}