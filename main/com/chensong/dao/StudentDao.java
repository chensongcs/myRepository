package com.chensong.dao;

import com.chensong.bean.Student;

public interface StudentDao {
	void addStudent(Student student);
	void delStudentByNo(int stuNo);
}
