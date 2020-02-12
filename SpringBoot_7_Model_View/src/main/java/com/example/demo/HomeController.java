package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("home")
	public ModelAndView Home(@RequestParam("myname")String name)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("NewFile");
		System.out.println("Welcome back "+name);

		return mv;
	}
}
