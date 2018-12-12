package uk.ac.belfastmet.belfastEvents.model;


import java.util.ArrayList;

import lombok.Data;

@Data
public class AllEvents {
	
	private ArrayList<Event> allEvents;
	
	public Event getEventWithId(String identifier ) {
		for (int i =0; i < this.allEvents.size(); i++) {
			Event currentEvent = this.allEvents.get(i);
			if( currentEvent.getIdentifier().equals(identifier) ) {
				return currentEvent;
			}
		}
		
		return null;
	}
	
}