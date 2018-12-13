package uk.ac.belfastmet.niAssembly.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersAPI {
	
	@JsonProperty("AllMembersList")
	//AllMemberslist allMembersList
	//Map<String, Object> allMembersList;
	AllMembersList allMembersList;
	
	public String toString() {
		
		String allMembersList = this.allMembersList.toString();
		
		return allMembersList;
		
		
	}

}
