package com.FashionBackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.CategoryDAO;
import com.Model.Category;

public class CategoryTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static CategoryDAO categoryDAO;

	@Autowired
	static Category category;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();

		
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

		

		category = (Category) context.getBean("category");

	}
	/*
	@Test
	public void createCategoryTestCase() {
		category.setId("CATF1");
		category.setName("WOMEN");
		category.setDescription("CLOTHES");

		boolean flag = categoryDAO.save(category);

		assertEquals("createCategoryTestCase", true, flag);

	}

	


	@Test
	public void deleteCategoryTestCase() {
		category.setName("Dental Medicine");
		boolean flag = categoryDAO.delete(category.getName());

		assertEquals("deleteCategoryTestCase", true, flag);

	}

	@Test
	public void listAllCategoryTestCase() {
		int actualSize = categoryDAO.list().size();
		assertEquals(6, actualSize);
	}
*/
}
