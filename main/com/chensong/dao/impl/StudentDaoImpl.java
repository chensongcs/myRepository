package com.chensong.dao.impl;

import org.springframework.stereotype.Repository;
import com.chensong.bean.Student;
import com.chensong.dao.StudentDao;
/**
 * 注解：
 * @Component:都可以
 * @Repository:dao层
 * @Service:service层
 * @Controller:控制器层
 *
 */
//相当于在IOC容器中配置<bean id="studentDao" class="com.chensong.dao.impl.StudentDaoImpl"></bean>

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
	public void addStudent(Student student){
		System.out.println("增加学生..."+student.getStuName());
	}

	public void delStudentByNo(int stuNo) {
		System.out.println("删除学生:  stuNo--"+stuNo);
	}
}
