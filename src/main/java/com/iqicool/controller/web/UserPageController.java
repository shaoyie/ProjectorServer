package com.iqicool.controller.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userPage")
public class UserPageController {
	
	//Demo for the case if we need a logout page, but we didn't use it in this project
	@GetMapping("logout")
	String logout(HttpServletRequest request) {
		try {
			request.logout();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "logout";
	}
}
