package com.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.transport.common.beans.User;
import com.transport.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired(required = true)
	UserService userService;

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ResponseEntity saveUser(@RequestBody User user) {
		int saveUser = userService.saveUser(user);
		return saveUser == 1 ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}

}
