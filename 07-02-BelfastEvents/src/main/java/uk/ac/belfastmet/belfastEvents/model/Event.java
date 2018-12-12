package uk.ac.belfastmet.belfastEvents.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)

public class Event {
	
	private String identifier;
	private String url;
	private String title;
	@JsonFormat(pattern = "yyy-MM-dd HH:mm:ss")
	private Date startDate;
	@JsonFormat(pattern = "yyy-MM-dd HH:mm:ss")
	private Date endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;

	
	public String toString() {
		
		
		String event = this.getIdentifier() + ", "
				+ this.getUrl() + ", "
				+ this.getTitle() + ", "
				+ this.getStartDate() + ", "
				+ this.getEndDate() + ", "
				+ this.getTime() + ", "
				+ this.getVenue() + ", "
				+ this.getAudience() + ", "
				+ this.getTheme() + ", "
				+ this.getCost() + ", "
				+ this.getContent() + ", "			
				;
			return event; 
		
		}
}

//	public String getIdentifier() {
//		return identifier;
//	}
//	public void setIdentifier(String identifier) {
//		this.identifier = identifier;
//	}


