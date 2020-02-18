package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.studentdao;
import com.example.demo.model.student;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

@RestController
public class studentContr 
{
	@Autowired
	studentdao stdao;
	
	@RequestMapping("/")
	public String Home()
	{
		return "NewFile";
	}
	
	@DeleteMapping("/adstd/{aid}")
	public String dltstudent(@PathVariable int aid)
	{
		student st=stdao.getOne(aid);
		stdao.delete(st);
		return "Deleted";
	}
	
	@GetMapping("/adstd")
	public String getstudent(student std)
	{
		System.out.println(std);
		stdao.save(std);
		return "NewFile";
	}
	
	@PostMapping(path="/adstd",consumes = {"application/json"})
	public student poststudent(@RequestBody student std)
	{
		System.out.println(std);
		stdao.save(std);
		return std;
	}
	
	@RequestMapping(path="/student/{id}",produces= {"application/xml"})
	@ResponseBody
	public Optional<student> getstudent(@PathVariable("aid") int id)
	{
		return stdao.findById(id);
	}
	
}
