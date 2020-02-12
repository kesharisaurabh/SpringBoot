package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	public ModelAndView Home(Student std)
	{
		System.out.println("hiii");
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",std);	
		mv.setViewName("NewFile");
		System.out.println(new Student().toString());
		
		return mv;
	}
}
