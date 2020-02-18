package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class student 
{
	@Id
	@GeneratedValue	
	private int aid;
	private String aname;
	private String atec;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAtec() {
		return atec;
	}
	public void setAtec(String atec) {
		this.atec = atec;
	}
	@Override
	public String toString() {
		return "student [aid=" + aid + ", aname=" + aname + ", atec=" + atec + "]";
	}
	
}
