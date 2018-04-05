package com.optum.caseManagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/questionaire")
public class restController {
	
	/**
	 * value = "/textArea",
	 * @PathVariable String id
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/textArea",method = RequestMethod.GET)
	public String getQuestionaire(Model model) {
		
		return "landingPage";
}
	/**
	 * value = "/textArea",
	 * @PathVariable String id
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/textArea",method = RequestMethod.POST)
	public String postQuestionaire(Model model) {
		
		return "questionairePage";
}
}