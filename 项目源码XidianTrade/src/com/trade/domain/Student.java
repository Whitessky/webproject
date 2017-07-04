package com.trade.domain;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private Integer studentId;
	private String studentName;
	private String studentNo;
	private String userName;
	private String password;

	private Set<Goods> Goods = new HashSet<Goods>();

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Goods> getGoods() {
		return Goods;
	}

	public void setGoods(Set<Goods> goods) {
		Goods = goods;
	}

	

}
