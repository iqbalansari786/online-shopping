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
	
/*	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setCategory_name("clothes");
		category.setDescription("This is some description for laptop!");
		category.setImageUrl("CAT_105.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDao.add(category));
		
		
	}
	*/
	
	
	
/*	@Test
	public void testGetCategory() {
		
		category = categoryDao.get(3);
		
		
		assertEquals("Successfully fetched a single category from the table!","Mobile",category.getCategory_name());
		
		
	}*/
	
	
	
/*	@Test
	public void testUpdateCategory() {
		
		category = categoryDao.get(3);
		
		category.setCategory_name("Machine");
		
		assertEquals("Successfully updated a single category in the table!",true,categoryDao.update(category));
		
		
	}*/
	
	/*
	@Test
	public void testDeleteCategory() {
		
		category = categoryDao.get(3);		
		assertEquals("Successfully deleted a single category in the table!",true,categoryDao.delete(category));
		
		
	}*/
	
	@Test
	public void testListCategory() {
					
		assertEquals("Successfully fetched the list of categories from the table!",3,categoryDao.list().size());
		
		
	}

}
