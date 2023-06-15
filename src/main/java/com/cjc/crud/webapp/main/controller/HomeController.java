package com.cjc.crud.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.crud.webapp.main.model.Student;
import com.cjc.crud.webapp.main.service.HomeService;

@Controller
public class HomeController 
{

	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	
	@RequestMapping("/registration")
	public String preRegister()
	{
		return "registration";
	}

	@RequestMapping("/reg")
	public String regData(@ModelAttribute Student s)
	{
		hs.saveData(s);
		return "login"; 
	}
	
	
	
	
	
}

