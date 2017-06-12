package com.ieee1986.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ieee1986.board.model.User;

@RestController
public class UserController {

	private Log log = LogFactory.getLog(UserController.class);

	public UserController() {

	}

	@RequestMapping(value = "/user/all", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUser() {
		if (log.isDebugEnabled()) {
			log.debug("UserController.getAllUser()");
		}

		List<User> users = new ArrayList<User>();
		users.add(new User("id_1", "name_1"));
		users.add(new User("id_2", "name_2"));
		users.add(new User("id_3", "name_3"));

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@PathVariable String userId) {
		if (log.isDebugEnabled()) {
			log.debug("UserController.getUser() : " + userId);
		}

		return new ResponseEntity<User>(new User(userId, userId), HttpStatus.OK);
	}
}
