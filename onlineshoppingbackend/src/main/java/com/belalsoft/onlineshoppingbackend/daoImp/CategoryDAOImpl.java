package com.belalsoft.onlineshoppingbackend.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.belalsoft.onlineshoppingbackend.dao.CategoryDAO;
import com.belalsoft.onlineshoppingbackend.dto.Category;

@Repository("categoryDao")

public class CategoryDAOImpl implements CategoryDAO {
	

	
	
	private static List<Category> categories=new ArrayList<Category>();
	static {
		
		Category category1=new Category();
		category1.setCategory_name("Mobile");
		category1.setCategory_id(1);
		category1.setActive(true);
		category1.setDescription("this is mobile");
		categories.add(category1);
		
		Category category2=new Category();
		category2.setCategory_name("camera");
		category2.setCategory_id(2);
		category2.setActive(true);
		category2.setDescription("this is good camera");
		categories.add(category2);
		
		Category category3=new Category();
		category3.setCategory_name("clothes");
		category3.setCategory_id(3);
		category3.setActive(true);
		category3.setDescription("this is good clothe");
		categories.add(category3);
	}

	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category cat:categories)
		{
			if(cat.getCategory_id()==id)
			{
				return cat;
			}
		}
		return null;
	}



	@Override
	public String chekc() {
		// TODO Auto-generated method stub
		return "true";
	}

}
