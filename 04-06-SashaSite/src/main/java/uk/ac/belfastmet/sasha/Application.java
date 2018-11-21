package uk.ac.belfastmet.sasha;

//import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@PostConstruct
	public void createPeople() {
		
//		ArrayList<People> people = new ArrayList<People>();
		
//		People donkey = new People("Donkey", "Dreamworks", "Donkey.png");
//		people.add(donkey);
//		People dragon = new People("Dragon", "Dreamworks", "Dragon.png");
//		people.add(dragon);
//		People fiona = new People("Fiona", "Dreamworks", "Fiona.png");
//		people.add(fiona);
//		People shrek = new People("Shrek", "Dreamworks", "Shrek.png");
//		people.add(shrek);
//		
//			
//People woody = new People("Woody", "Pixar", "Woody.png");
//	people.add(woody);
//		People rex = new People("Rex", "Pixar", "Rex.png");
//		people.add(rex);
//		People slinky = new People("Slinky", "Pixar", "Slinky.png");
//		people.add(slinky);
//		People buzz = new People("Buzz", "Pixar", "Buzz.png");
//		people.add(buzz);

	}
}