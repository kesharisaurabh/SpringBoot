package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.studentdao;
import com.example.demo.model.student;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

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
	
	@RequestMapping("/student/{id}")
	@ResponseBody
	public Optional<student> getstudent(@PathVariable("aid") int id)
	{
		return stdao.findById(id);
	}
	
}
