package com.example.tutiya.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tutiya.bean.ListBean;
import com.example.tutiya.service.ListServiceIF;
import com.example.tutiya.service.ListServiceImpl;

/**
 * Servlet implementation class WelcomeController
 */
@Controller
public class ListController {
    
	@Autowired
	ListServiceIF listService;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@RequestMapping(path="/list", method=RequestMethod.POST, params="next")
	private String display(Model model, @RequestParam String dataId) {
		
		List searchResultList = listService.search();
		
		ListBean formBean = new ListBean();
		formBean.setDataId(dataId);
		model.addAttribute(formBean);
		
		return "list";
	}

}
