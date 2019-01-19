package com.example.tutiya.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.tutiya.bean.SearchForm;

/**
 * Servlet implementation class WelcomeController
 */
@Controller
public class SearchController {
    
	private static final Logger log = LoggerFactory.getLogger(SearchController.class);
	
	@ModelAttribute
	private SearchForm setUp() {
		return new SearchForm();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@RequestMapping(path= "/", method=RequestMethod.GET)
	private String display() {
		return "search";
	}

}
