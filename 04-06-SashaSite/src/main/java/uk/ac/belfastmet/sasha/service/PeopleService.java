package uk.ac.belfastmet.sasha.service;

import java.util.ArrayList;

import uk.ac.belfastmet.sasha.domain.People;

public class PeopleService {
	
	public PeopleService() {
		super();
	}
	
public ArrayList<People> getDreamworksPeoples(){
		ArrayList<People> peoples = new ArrayList<People>();
		
		People donkey = new People("Donkey", "Dreamworks", "donkey.png");
		peoples.add(donkey);
		People dragon = new People("Dragon", "Dreamworks", "dragon.png");
		peoples.add(dragon);
		People fiona = new People("Fiona", "Dreamworks", "fiona.png");
		peoples.add(fiona);
		People shrek = new People("Shrek", "Dreamworks", "shrek.png");
		peoples.add(shrek);
		
		return peoples;
		
	}
	
public ArrayList<People> getPixarPeoples(){
	ArrayList<People> peoples = new ArrayList<People>();
	
	People woody = new People("Woody", "Pixar", "Woody.png");
	peoples.add(woody);
	People rex = new People("Rex", "Pixar", "rex.png");
	peoples.add(rex);
	People slinky = new People("Slinky", "Pixar", "slinky.png");
	peoples.add(slinky);
	People buzz = new People("Buzz", "Pixar", "buzz.png");
	peoples.add(buzz);
	
	return peoples;
	
}
}