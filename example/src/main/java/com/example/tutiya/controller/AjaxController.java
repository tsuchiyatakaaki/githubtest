package com.example.tutiya.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutiya.bean.AjaxForm;
import com.example.tutiya.bean.ListBean;
import com.example.tutiya.bean.ListForm;
import com.example.tutiya.bean.RegistUpdateForm;
import com.example.tutiya.bean.SearchForm;
import com.example.tutiya.dao.RegistUpdateDaoIF;
import com.example.tutiya.exception.ExampleException;
import com.example.tutiya.mybatis.entity.generated.Teams;
import com.example.tutiya.service.AjaxServiceIF;
import com.example.tutiya.service.ListServiceIF;
import com.example.tutiya.service.ListServiceImpl;
import com.example.tutiya.service.RegistUpdateServiceIF;
import com.example.tutiya.service.RegistUpdateServiceImpl;

/**
 * Servlet implementation class WelcomeController
 */
@RestController
public class AjaxController {
    
	@Autowired
	AjaxServiceIF ajaxService;
	
	@RequestMapping(path="/ajax/{teamId}", method=RequestMethod.GET)
	private ListBean getAjaxData(@PathVariable int teamId) {
		
		ListBean searchResultBean = ajaxService.searchData(teamId);
		
		return searchResultBean;
	}
}
