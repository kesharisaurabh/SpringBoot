package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.student;

public interface StudentDao extends CurdRepository<student, Integer>
{

}