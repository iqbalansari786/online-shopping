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
		mv.addObject("userClickedHome", true);
		mv.addObject("title", "Home Page");
		return mv;
	}
	@RequestMapping(value= {"/viewAllProduct"})

	public ModelAndView viewProduct() {
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("greeting", "welcome to spring mvc");
		mv.addObject("userClickedProduct", true);
		mv.addObject("title", "Content List");
		return mv;
	}
	@RequestMapping(value= {"/about"})

	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("main");
	
		mv.addObject("userClickedAbout", true);
		mv.addObject("title", "About");
		return mv;
	}
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("main");
	
		mv.addObject("userClickedContact", true);
		mv.addObject("title", "Contact");
		return mv;
	}

}
