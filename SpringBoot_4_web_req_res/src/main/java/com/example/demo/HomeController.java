package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String Home(HttpServletRequest req)
	{
		HttpSession session=req.getSession();
		String Name=req.getParameter("name");
		System.out.println(Name);
		System.out.println("hiiii");
		session.setAttribute("name", Name);
		
		return "NewFile";
	}
}
