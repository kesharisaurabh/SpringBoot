package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.student;

public interface studentdao extends JpaRepository<student, Integer>
{
			List<student> findbyTec(String tec);
}
