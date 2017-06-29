package com.trade.services;

import java.util.List;

import com.trade.domain.Student;

public interface StudentService {

	Student login(Student student);

	void register(Student student);

	List<Student> findAll();

	Student findById(Integer integer);

	void delete(Student student);

}
