package uk.ac.belfastmet.sbcontroller.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/toystory")

public class ToyStory {
	
	@GetMapping("")
	public String toystory(Model model) {
		return "Toy Story Characters";
	}

	@GetMapping("/woody")
	public String woody(Model model) {
		return "Woody was played by Tom Hanks";
	}
	
	
	@GetMapping("/buzz")
	public String buzz(Model model) {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("/rex")
	public String rex(Model model) {
		return "Rex was played by Wallace Shawn";
	}
	
	@GetMapping("/littlebopeep")
	public String littlebopeep(Model model) {
		return "Little Bo Peep was played by Annie Potts";
	}
	
	@GetMapping("/sid")
	public String sid(Model model) {
		return "Sid was played by Erik von Detten";
	}
	
	@GetMapping("/slinky")
	public String slinky(Model model) {
		return "Slinky was played by Jim Varney";
	}
	
	@GetMapping("/andy")
	public String andy(Model model) {
		return "Andy was played by John Morris";
	}
	
	
}
