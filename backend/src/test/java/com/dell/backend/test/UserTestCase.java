package com.dell.backend.test;

import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dell.backend.dao.UserDAO;
import com.dell.backend.dto.Address;
import com.dell.backend.dto.Cart;
import com.dell.backend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;
	private Cart cart = null;
	private Address address = null;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.dell.backend");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	
/*
	@Test
	public void testAddUser() {
		
		user = new User() ;
		user.setFirstName("Magesh");
		user.setLastName("Raja");
		user.setEmail("mr@gmail.com");
		user.setContactNumber("9876543210");
		user.setRole("CUSTOMER");
		user.setEnabled(true);
		user.setPassword("12345");
		
		
		address = new Address();
		address.setAddressLineOne("1/B Anna Nagar, AB street");
		address.setAddressLineTwo("Near fancy Store");
		address.setCity("Chennai");
		address.setState("Tamilnadu");
		address.setCountry("India");
		address.setPostalCode("600101");
		address.setBilling(true);
		
		cart = new Cart();
		
		// linked the address with the user
		address.setUser(user);
		
		// linked the cart with the user
		cart.setUser(user);
		// link the user with the cart
		user.setCart(cart);
		
		// add the user
		assertEquals("Failed to add the user!", true, userDAO.add(user));	
		// add the address
		assertEquals("Failed to add the billing address!", true, userDAO.addAddress(address));

				
		// add the shipping address
		address = new Address();
		address.setAddressLineOne("2/B T Nagar, Kalayan street");
		address.setAddressLineTwo("Near ST Departmental Store");
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setCountry("India");
		address.setPostalCode("600102");
		address.setUser(user);
		assertEquals("Failed to add the shipping address!", true, userDAO.addAddress(address));
		
	}
	
	*/

	// working for uni-directional
/*
	@Test
	public void testAddAddress() {
		user = userDAO.get(1);
		
		address = new Address();
		address.setAddressLineOne("3/B Ambattur, DT Nagar");
		address.setAddressLineTwo("Near cross cut road");
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setCountry("India");
		address.setPostalCode("600101");
				
		address.setUser(user);
		// add the address
		assertEquals("Failed to add the address!", true, userDAO.addAddress(address));	
	}
	
	@Test
	public void testUpdateCart() {
		user = userDAO.get(1);
		cart = user.getCart();
		cart.setGrandTotal(10000);
		cart.setCartLines(1);
		assertEquals("Failed to update the cart!", true, userDAO.updateCart(cart));			
	} 

*/
	

	
}
