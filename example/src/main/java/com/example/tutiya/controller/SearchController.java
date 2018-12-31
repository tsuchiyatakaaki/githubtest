package com.example.tutiya.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.tutiya.bean.SearchBean;

/**
 * Servlet implementation class WelcomeController
 */
@Controller
public class SearchController {
    //gittest3
	
	@ModelAttribute
	private SearchBean setUp() {
		return new SearchBean();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@RequestMapping(path= "/", method=RequestMethod.GET)
	private String display() {
		return "search";
	}

}
