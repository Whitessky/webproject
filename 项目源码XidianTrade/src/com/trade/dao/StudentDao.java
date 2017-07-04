package com.trade.dao;

import java.util.List;

import com.trade.domain.Student;

public interface StudentDao {

	Student findByUserNameAndPassword(Student student);
	
	void register(Student student);

	List<Student> findAll();

	Student findById(Integer integer);

	void delete(Student student);

}
