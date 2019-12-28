package com.belalsoft.onlineshoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.belalsoft.onlineshoppingbackend.dto.Category;


public interface CategoryDAO {
	

	Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*	boolean add(Category category);

	public List<Category> list();

	public Category get(int id);*/


}
