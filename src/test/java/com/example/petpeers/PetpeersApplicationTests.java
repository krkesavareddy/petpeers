package com.example.petpeers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.petpeers.pojo.User;
import com.example.petpeers.service.UserService;
import com.example.petpeers.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetpeersApplicationTests {
	// create object of User
	User user = new User();
	UserService userService = new UserServiceImpl();

	@Test
	public void testUserId() {
		// test user id null or not
		user.setId((long) 101);
		assertTrue(user.getId() == 101);
	}

	@Test
	public void testUserName() {
		// test user name null or not
		user.setUserName("ankit");
		assertTrue(user.getUserName() == "ankit");
	}

	@Test
	public void testUserPassword() {
		// test user password is null or not
		user.setPassword("singh");
		assertTrue(user.getPassword() == "singh");
	}

	@Test
	public void testUserConfirmPassword() {
		// test confirm password
		user.setConfirmPassword("singh");
		assertTrue(user.getConfirmPassword() == "singh");
	}

	/*@Test
	public void testcreateUser() {
		user.setId((long) 101);
		user.setUserName("ankit");
		user.setPassword("singh");
		user.setConfirmPassword("singh");
		userService.createUser(user);
		as
	}*/
}
