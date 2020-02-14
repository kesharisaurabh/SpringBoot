package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.student;


@Controller
public class StudentController 
{
	@Autowired
	StudentDao sdao;
	
	@RequestMapping("/")
	public String std()
	{
		System.out.println("hiiii");
		return "NewFile.jsp";
	}
	@RequestMapping("/addstudent")
	public String addstudent(student std)
	{
		System.out.println(std);
		sdao.save(std);
		return "NewFile.jsp";
	}
	
}
