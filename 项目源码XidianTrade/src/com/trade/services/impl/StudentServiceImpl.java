package com.trade.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.trade.dao.StudentDao;
import com.trade.domain.Student;
import com.trade.services.StudentService;

@Transactional
public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public Student login(Student student) {
		Student existStudent=studentDao.findByUserNameAndPassword(student);
		return existStudent;
	}

	@Override
	public void register(Student student) {
		studentDao.register(student);		
	}

	@Override
	public List<Student> findAll() {
		List<Student> list=studentDao.findAll();
		return list;
	}

	@Override
	public void delete(Student student) {
		studentDao.delete(student);
	}

	@Override
	public Student findById(Integer integer) {
		return studentDao.findById(integer);
	}
	
	
}
