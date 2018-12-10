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
	 * ͨ��ע��ʵ������ʹaddStudent�����еķ���ȫ�ɹ���ȫʧ��
	 */
	@Transactional(readOnly=false,timeout=30,
			rollbackForClassName={"SQLException","ArithmeticException"},
			noRollbackFor=InterruptedException.class,
			isolation=Isolation.READ_COMMITTED,
			propagation=Propagation.REQUIRED)
	public boolean addStudent(Student student) {
		//if(��ѧ���Ƿ����)
		//��������...
		//studentDao = null;ģ���쳣֪ͨ
		studentDao.addStudent(student);
		return true;
	}
	
	public void delStudentByNo(int stuNo){
		studentDao.delStudentByNo(stuNo);
	}
}
