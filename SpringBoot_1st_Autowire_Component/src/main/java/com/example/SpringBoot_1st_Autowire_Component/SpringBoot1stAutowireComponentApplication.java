package com.example.SpringBoot_1st_Autowire_Component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBoot1stAutowireComponentApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context=SpringApplication.run(SpringBoot1stAutowireComponentApplication.class, args);
		Student std1=context.getBean(Student.class);
		std1.Show(8, "SAURABH");
		
		Student std2=context.getBean(Student.class);
		std2.Show(9, "Nagesh");
	}

}
