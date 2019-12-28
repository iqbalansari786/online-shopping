package com.belalsoft.onlineshopping.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.belalsoft.onlineshopping.exception.ProductNotFoundException;
import com.belalsoft.onlineshoppingbackend.dao.CategoryDAO;
import com.belalsoft.onlineshoppingbackend.dao.ProductDAO;
import com.belalsoft.onlineshoppingbackend.dto.Category;
import com.belalsoft.onlineshoppingbackend.dto.Product;



@Controller
public class PageController {
	
	private final static Logger logger=Logger.getLogger(PageController.class);
	
	
	@Autowired
	private CategoryDAO categoryDao;
	

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value= {"/","/home"})

	public ModelAndView homePage() {
		System.out.println("home controller called");
		logger.info("inside home page:INFO");
		logger.debug("inside home page:DEBUG");
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
	
	@RequestMapping("/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable("id") int id) throws ProductNotFoundException
	{
		ModelAndView mv=new ModelAndView("main");
		Product product=productDAO.get(id);
		
		if(product==null)
		{
			throw new ProductNotFoundException();
		}
		product.setViews(product.getViews()+1);
		productDAO.update(product);
		mv.addObject("title",product.getName());
		mv.addObject("product",product);
		mv.addObject("userClickedSingleCategory",true);
		
		return mv;
	}

}
