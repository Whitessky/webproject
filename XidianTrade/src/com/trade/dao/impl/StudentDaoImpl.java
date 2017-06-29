package com.trade.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.trade.dao.StudentDao;
import com.trade.domain.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	@Override
	public Student findByUserNameAndPassword(Student student) {
		String hql = "from Student where userName=? and password=?";
		List<Student> list = this.getHibernateTemplate().find(hql,
				student.getUserName(), student.getPassword());
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void register(Student student) {
		this.getHibernateTemplate().save(student);
	}

	@Override
	public List<Student> findAll() {
		DetachedCriteria criteria=DetachedCriteria.forClass(Student.class);
		List<Student> studentList=this.getHibernateTemplate().findByCriteria(criteria);
		return studentList;
	}

	@Override
	public Student findById(Integer integer) {
		return this.getHibernateTemplate().get(Student.class, integer);
	}

	@Override
	public void delete(Student student) {
		this.getHibernateTemplate().delete(student);
	}

}
