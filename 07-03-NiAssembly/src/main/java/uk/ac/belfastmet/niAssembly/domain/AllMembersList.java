package uk.ac.belfastmet.niAssembly.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {
	
	@JsonProperty("Member");
	//ArrayList<Members> members;
	ArrayList<Object> members;


	public String toString() {
		return this.allMembersList.toString();
	}
	
	

}
