package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController 
{
	@RequestMapping("/")
	public String std()
	{
		System.out.println("hiiii");
		return "NewFile.jsp";
	}
}
