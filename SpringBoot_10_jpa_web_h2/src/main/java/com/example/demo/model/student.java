package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@Entity
public class student 
{
	@Id
	private int id;
	private String name;
	private String scl;
	private int age;
	
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
		return "student [id=" + id + ", name=" + name + ", scl=" + scl + ", age=" + age + "]";
	}
}	
	