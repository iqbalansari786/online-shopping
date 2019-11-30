package com.belalsoft.onlineshoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.belalsoft.onlineshoppingbackend.dao.CategoryDAO;
import com.belalsoft.onlineshoppingbackend.dto.Category;


public class CategoryTestClass {
	
	private static AnnotationConfigApplicationContext annotationConfigApplicationContext;
	
	private static CategoryDAO categoryDao;
	
	private Category category;
	
	@BeforeClass
	public static  void init()
	{
			annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
			annotationConfigApplicationContext.scan("com.belalsoft.onlineshoppingbackend");
			annotationConfigApplicationContext.refresh();
	
			categoryDao=(CategoryDAO)annotationConfigApplicationContext.getBean("categoryDao");
		
	}
	
	@Test
	public void testAddCategory()
	{

		assertEquals("testing for adding element in category table", null, categoryDao.get(5));
		
	}
	
	
	
	

}
