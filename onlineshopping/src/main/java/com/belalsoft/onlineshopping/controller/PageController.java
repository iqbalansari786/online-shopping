package com.belalsoft.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.belalsoft.onlineshoppingbackend.dao.CategoryDAO;
import com.belalsoft.onlineshoppingbackend.dto.Category;



@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDao;
	

	
	
	@RequestMapping(value= {"/","/home"})

	public ModelAndView homePage() {
		System.out.println("home controller called");
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("categories", 	categoryDao.list());
		
		mv.addObject("userClickedHome", true);
		mv.addObject("title", "Home Page");
		return mv;
	}

	@RequestMapping(value= {"/about"})

	public ModelAndView about() {
		System.out.println("about controller called");
		ModelAndView mv = new ModelAndView("main");
	
		mv.addObject("userClickedAbout", true);
		mv.addObject("title", "About");
		return mv;
	}
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		System.out.println("contact controller called");
		ModelAndView mv = new ModelAndView("main");
	
		mv.addObject("userClickedContact", true);
		mv.addObject("title", "Contact");
		return mv;
	}
	@RequestMapping(value= {"/viewAllProduct"})

	public ModelAndView showAllProduct() {
		System.out.println("view all product  controller called");
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("categories", categoryDao.list());
		mv.addObject("userClickedProduct", true);
		mv.addObject("title", "Content List");
		return mv;
	}
	@RequestMapping(value= "show/{id}/products")

	public ModelAndView showCategoryProduct(@PathVariable("id") int id) {
		System.out.println("category controller called");
		Category category=null;
	 category=categoryDao.get(id);
	 System.out.println("category  name"+category.getCategory_name());
	
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("title", category.getCategory_name());
	
	
		mv.addObject("userClickedCategoryProduct", true);
		
		mv.addObject("categories", categoryDao.list());
		
		mv.addObject("category", category);
		
	
		return mv;
	}

}
