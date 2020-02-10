package com.example.SpringBoot_1st_Autowire_Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Student 
{
	int id;
	String name;
	@Autowired
	@Qualifier(value = "le1")
	Leptop lepi;
	
	public Student() {
		super();
		System.out.println("Student Constructor");
	}

	public void Show(int sid,String sname)
	{
		id=sid;
		name=sname;
		System.out.println(id+" "+name);
		lepi.Compiler();
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
}
