package com.chensong.dao.impl;

import org.springframework.stereotype.Repository;
import com.chensong.bean.Student;
import com.chensong.dao.StudentDao;
/**
 * ע�⣺
 * @Component:������
 * @Repository:dao��
 * @Service:service��
 * @Controller:��������
 *
 */
//�൱����IOC����������<bean id="studentDao" class="com.chensong.dao.impl.StudentDaoImpl"></bean>

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
	public void addStudent(Student student){
		System.out.println("����ѧ��..."+student.getStuName());
	}

	public void delStudentByNo(int stuNo) {
		System.out.println("ɾ��ѧ��:  stuNo--"+stuNo);
	}
}
