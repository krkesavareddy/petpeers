package com.example.petpeers.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petpeers.pojo.Response;
import com.example.petpeers.pojo.User;
import com.example.petpeers.pojo.UserDTO;
import com.example.petpeers.service.UserService;

@RestController
@RequestMapping("/pets")
public class PetsAppController {

	@Autowired
	private UserService userService;

	//User Registration done here
	@PostMapping("/add")
	public Response addUser(@RequestBody UserDTO userdto){
		User user = new User();
		BeanUtils.copyProperties(userdto, user);
		userService.createUser(user);
		return new Response("User Successful Register " + user.getId(), Boolean.TRUE);
	}

}
