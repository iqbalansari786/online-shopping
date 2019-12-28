package com.belalsoft.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.belalsoft.onlineshoppingbackend.dao.CategoryDAO;
import com.belalsoft.onlineshoppingbackend.dto.Category;
import com.belalsoft.onlineshoppingbackend.dto.Product;
import com.belalsoft.onlineshoppingbackend.*;
import java.util.*;

@Controller
@RequestMapping("/manage")
public class ManageProductController {
	@Autowired
	private CategoryDAO categoryDao;
	
	@RequestMapping("/products")
	public ModelAndView manageProduct()
	{
		
		ModelAndView mv=new ModelAndView("main");
		mv.addObject("userClickedManageProduct",true);
		mv.addObject("title","Manage product");
		Product nProduct =new Product();
		nProduct.setSupplierId(1);
		nProduct.setActive(true);
		mv.addObject("product",nProduct);
		
		
		return mv;
	}
	
	@ModelAttribute("categories")
	public List<Category> getCategories()
	
	{
		return categoryDao.list();
		
	}

}
