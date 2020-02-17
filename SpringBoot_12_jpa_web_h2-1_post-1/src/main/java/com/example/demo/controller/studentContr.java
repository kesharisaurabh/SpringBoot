package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.studentdao;
import com.example.demo.model.student;

@Controller
public class studentContr 
{
	@Autowired
	studentdao stdao;
	
	@RequestMapping("/")
	public String Home()
	{
		return "NewFile";
	}
	
	@RequestMapping("/adstd")
	public String addstudent(student std)
	{
		System.out.println(std);
		stdao.save(std);
		return "NewFile";
	}
	
	@RequestMapping("/getstd")
	public ModelAndView getstudent(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("showStudent");
		student std1=stdao.findById(aid).orElse( new student());
		
		System.out.println(stdao.findbyTec("java"));//1:43:8
		
		mv.addObject(std1);
		return mv;
	}
	
}
