package com.belalsoft.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value= {"/","/home"})

	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("greeting", "welcome to spring mvc");
		mv.addObject("title", "Home Page");
		return mv;
	}

}
