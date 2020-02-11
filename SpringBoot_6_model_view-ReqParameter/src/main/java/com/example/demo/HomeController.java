package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	public String Home(@RequestParam("myname")String name,HttpSession session)
	{
		System.out.println("Welcome "+name);
		System.out.println("Hii");
		session.setAttribute("name", name);
		return "NewFile";
	}
}
