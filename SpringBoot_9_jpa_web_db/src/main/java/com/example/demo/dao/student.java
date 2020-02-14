package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student 
{
	@Id
	String name;
	String scl;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScl() {
		return scl;
	}
	public void setScl(String scl) {
		this.scl = scl;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", scl=" + scl + ", age=" + age + "]";
	}
	
	
}
