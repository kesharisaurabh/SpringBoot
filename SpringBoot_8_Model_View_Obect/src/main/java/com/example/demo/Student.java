package com.example.demo;

public class Student 
{
	int sid;
	String sname;
	String slang;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSlang() {
		return slang;
	}
	public void setSlang(String slang) {
		this.slang = slang;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", slang=" + slang + "]";
	}

	
	
}
