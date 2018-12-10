package com.chensong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chensong.bean.Student;
import com.chensong.dao.StudentDao;
import com.chensong.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	/**
	 * 通过注解实现事务，使addStudent方法中的方法全成功或全失败
	 */
	@Transactional(readOnly=false,timeout=30,
			rollbackForClassName={"SQLException","ArithmeticException"},
			noRollbackFor=InterruptedException.class,
			isolation=Isolation.READ_COMMITTED,
			propagation=Propagation.REQUIRED)
	public boolean addStudent(Student student) {
		//if(该学生是否存在)
		//增加其他...
		//studentDao = null;模拟异常通知
		studentDao.addStudent(student);
		return true;
	}
	
	public void delStudentByNo(int stuNo){
		studentDao.delStudentByNo(stuNo);
	}
}
