package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.student;

public interface studentdao extends JpaRepository<student, Integer>
{
			List<student> findbyTec(String tec);
			List<student> findbyaidGreaterThan(int aid);
			
			@Query("from student where tec=?1 order by aname")
			List<student> findbyTecSorted(String tec); 
}
