package com.optum.caseManagement.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/questionaire")
public class restController {
	
    String dropDownType; 
    ModelAndView modelView;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView LandingControllerPage(HttpServletRequest request, HttpServletResponse response)
			throws SQLException {
		ModelAndView modelView = new ModelAndView("landingPage");
		return modelView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView LandingControllerPagepost(HttpServletRequest request, HttpServletResponse response)
			throws SQLException {
		dropDownType = request.getParameter("type");
		if(dropDownType.equals("textarea")) {
	    modelView = new ModelAndView("TextArea");
		}
		else if(dropDownType.equals("radio")) {
		    modelView = new ModelAndView("Radio");
			}
		else if(dropDownType.equals("checkbox")) {
		    modelView = new ModelAndView("CheckBox");
			}
		else{
		    modelView = new ModelAndView("landingPage");
			}
		return modelView;
	}

}