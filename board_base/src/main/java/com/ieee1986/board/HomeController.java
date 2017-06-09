package com.ieee1986.board;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ieee1986.board.model.User;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ResponseEntity<User> home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		User user = new User();
		user.setId("aaa");
		user.setName("bbb");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
