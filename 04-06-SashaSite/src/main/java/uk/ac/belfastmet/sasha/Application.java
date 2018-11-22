package uk.ac.belfastmet.sasha;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.sasha.domain.People;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void createPeoples() {
		
		ArrayList<People> peoples = new ArrayList<People>();
		
		People donkey = new People("Donkey", "Dreamworks", "donkey.png");
		peoples.add(donkey);
		People dragon = new People("Dragon", "Dreamworks", "dragon.png");
		peoples.add(dragon);
		People fiona = new People("Fiona", "Dreamworks", "fiona.png");
		peoples.add(fiona);
		People shrek = new People("Shrek", "Dreamworks", "shrek.png");
		peoples.add(shrek);
		
			
		People woody = new People("Woody", "Pixar", "woody.png");
		peoples.add(woody);
		People rex = new People("Rex", "Pixar", "rex.png");
		peoples.add(rex);
		People slinky = new People("Slinky", "Pixar", "slinky.png");
		peoples.add(slinky);
		People buzz = new People("Buzz", "Pixar", "buzz.png");
		peoples.add(buzz);

	}
}