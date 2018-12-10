package com.chensong.service;

import com.chensong.bean.Student;

public interface StudentService {
	boolean addStudent(Student student);
	void delStudentByNo(int stuNo);
}
