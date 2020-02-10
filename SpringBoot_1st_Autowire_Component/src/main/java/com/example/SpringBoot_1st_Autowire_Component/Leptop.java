package com.example.SpringBoot_1st_Autowire_Component;

import org.springframework.stereotype.Controller;

@Controller("le1")
public class Leptop 
{
	int RAM;
	String Lname;
	int CPU;
	
	
	
	public int getRAM() {
		return RAM;
	}


	public void setRAM(int rAM) {
		RAM = rAM;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public int getCPU() {
		return CPU;
	}


	public void setCPU(int cPU) {
		CPU = cPU;
	}


	public void Compiler()
	{
		System.out.println("Leptop COmpiler ");
	}
	
}
