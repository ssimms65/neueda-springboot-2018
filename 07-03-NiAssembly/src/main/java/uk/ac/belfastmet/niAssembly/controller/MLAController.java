package uk.ac.belfastmet.niAssembly.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.niAssemb.AllMembersList;
import uk.ac.belfastmet.niAssembly.domain.AllMembersAPI;

@Controller
@RequestMapping
public class MLAController {
	
	@GetMapping()
	public String home() {
		
		String allMembersUrlForConstituency1Url = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";
		RestTemplate restTemplate = new RestTemplate();
		
		AllMembersAPI allMembersAPI = restTemplate.getForObject(allMembersUrlForConstituency1Url, AllMembersAPI.class);
		AllMembersList allMembersList = allMembersAPI.getAllMembersList().toString();
		
		Logger logger = LoggerFactory.getLogger(MLAController.class);
		logger.info(allMembersAPI.toString());
		
		return "index";
	}

}
