package com.belalsoft.onlineshoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.belalsoft.onlineshoppingbackend.dto.Category;


public interface CategoryDAO {

	
	public List<Category> list();

	public Category get(int id);
	public String chekc();

}
