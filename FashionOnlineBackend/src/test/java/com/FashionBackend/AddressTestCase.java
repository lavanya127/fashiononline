package com.FashionBackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.AddressDAO;
import com.Model.Address;



public class AddressTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static AddressDAO addressDAO;

	@Autowired
	static Address address;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();

		addressDAO = (AddressDAO) context.getBean("addressDAO");

		address = (Address) context.getBean("address");

	}
	/*
	@Test
	public void createAddressTestCase() {
		address.setId("lavanya");
		address.setUser_id("lavanya");
		address.setH_no("18");
		address.setStreet("jaya Enclave");
		address.setCity("DSNR");
		address.setCountry("India");
		address.setPin("502018");

		boolean flag = addressDAO.save(address);

		assertEquals("createAddressTestCase", true, flag);

	}



	@Test
	public void listAllAddressTestCase() {
		int actualSize = addressDAO.list().size();
		assertEquals(2, actualSize);
	}*/

}
