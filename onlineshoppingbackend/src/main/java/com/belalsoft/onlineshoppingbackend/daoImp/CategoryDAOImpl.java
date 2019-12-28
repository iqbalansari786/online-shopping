package com.belalsoft.onlineshoppingbackend.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.belalsoft.onlineshoppingbackend.dao.CategoryDAO;
import com.belalsoft.onlineshoppingbackend.dto.Category;


@Transactional
@Repository("categoryDao")

public class CategoryDAOImpl implements CategoryDAO {
	

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Category> list() {
		
		String selectActiveCategory = "FROM Category WHERE active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
				
		query.setParameter("active", true);
						
		return query.getResultList();
	}
	
	@Override
	public Category get(int id) {
		System.out.println("after converted using valueof.."+Integer.valueOf(id)+"..withou..."+id);

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));

	}


	@Override

	public boolean add(Category category) {

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}
	
	
	@Override
	public boolean update(Category category) {

		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean delete(Category category) {
		
		category.setActive(false);
		
		try {
			// add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
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

	@Override
	
	public boolean add(Category category) {
		
		try {

		session = sessionFactory.getCurrentSession();

		session.persist(category);
		return true;
		}
		
		catch (Exception e) {
			System.out.println("actual exception..."+e);
			return false;
		}
	
		

	}*/


	

}
