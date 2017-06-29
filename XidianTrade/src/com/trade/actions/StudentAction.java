package com.trade.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trade.domain.Student;
import com.trade.services.StudentService;

public class StudentAction extends ActionSupport implements
		ModelDriven<Student> {

	private Student student = new Student();

	@Override
	public Student getModel() {
		return student;
	}

	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public String login() {
		
		if(student.getUserName().equals("root")&&student.getPassword().equals("root")){
			return "rootLogin";
		}
		
		Student existStudent = studentService.login(student);
		if (existStudent == null) {
			// 登入失败
			this.addActionError("用户或密码错误！！！");
			return INPUT;
		} else {
			// 登入成功
			ActionContext.getContext().getSession()
					.put("existStudent", existStudent);
			return "loginSuccess";
		}
	}
	
	public String rootFindAll(){
		List<Student> list=studentService.findAll();
		ActionContext.getContext().getValueStack().set("studentList", list);
		return "rootFindAll";
	}
	
	public String register(){
		studentService.register(student);
		return "registSuccess";
	}
	
	public String delete(){
		student=studentService.findById(student.getStudentId());
		studentService.delete(student);
		return "deleteSuccess";
	}

}
