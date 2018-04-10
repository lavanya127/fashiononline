package com.FashionBackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.UserDAO;
import com.Model.User;

public class UserTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static UserDAO userDAO;

	@Autowired
	static User user;
	/*	
	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");

		user = (User) context.getBean("user");

	}

	@Test
	public void createUserTestCase() {
		user.setEmail("jaya@gmail.com");
		user.setId("jaya28");
		user.setName("jaya sripathi");
		user.setPassword("jaya");
		user.setCountry("India");
		user.setAddress("machilipatnam");
		user.setRole("ROLE_USER");
		user.setContact("8332916295");
		boolean flag = userDAO.save(user);

		assertEquals("createUserTestCase", true, flag);

	}
	/*
	@Test
	public void updateUserTestCase() {
		user.setEmail("lavanya1278@gmail.com");
		user.setId("lavanya");
		user.setName("lavanya sripathi");
		user.setPassword("sripathi");
		user.setCountry("India");
		user.setAddress("vijayawada");
		user.setRole("ROLE_USER");
		user.setContact("9490195730");
		boolean flag = userDAO.update(user);

		assertEquals("updateUserTestCase", true, flag);

	}

	@Test
	public void validateUserTestCase() {

		boolean flag = userDAO.validate("lavanya1278", "sripathi");
		assertEquals(true, flag);

	}

	
	@Test
	public void listAllUserTestCase() {
		int actualSize = userDAO.list().size();
		assertEquals(2, actualSize);
	}
*/
}
