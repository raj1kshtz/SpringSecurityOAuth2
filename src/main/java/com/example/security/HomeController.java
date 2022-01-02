package com.example.security;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "Home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
	}
	
	/*
	 * private void setDummyCookie(HttpServletResponse response) { Cookie cookie =
	 * new Cookie("dummyCookie", "dummy_cookie"); cookie.setMaxAge(2592000);
	 * cookie.setPath("/"); response.addCookie(cookie); }
	 */
	
}
