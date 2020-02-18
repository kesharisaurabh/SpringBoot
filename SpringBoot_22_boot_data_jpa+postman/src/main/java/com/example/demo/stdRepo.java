package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.student;


@RepositoryRestResource(collectionResourceRel = "student",path="student")
public interface stdRepo extends JpaRepository<student, Integer> 
{

}
