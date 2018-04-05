package com.optum.caseManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class landingController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String homeController(Model model)
	{
		return "landingPage";
	}

}
