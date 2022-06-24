package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

	List<Student> findAllByAddress(String address);
}
