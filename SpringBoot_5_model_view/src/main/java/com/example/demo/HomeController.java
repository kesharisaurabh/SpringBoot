package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	public String Home(String name,HttpSession session)
	{
		
		System.out.println("Name "+name);
		session.setAttribute("name", name);
		
		return "NewFile";
	}
}
