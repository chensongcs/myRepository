package com.chensong.service;

import com.chensong.bean.Student;

public interface StudentService {
	boolean addStudent(Student student);
	boolean addStudent2(Student student);
	void delStudentByNo(int stuNo);
}
