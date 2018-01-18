package com.iqicool.controller.rest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqicool.model.Account;

@RestController
@RequestMapping("user")
public class UserController {

	@GetMapping("login")
	Account login() {
		return new Account();
	}

	@GetMapping("logout")
	String logout(HttpServletRequest request) {
		try {
			request.logout();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Server side is okay, for client side need to clear the user
		// cridentials as we are using HTTP basic authentication
		// IE: document.execCommand('ClearAuthenticationCache');
		// Other browser: ajax to request any page with wrong username/pwd
		return "ok";
	}
}
