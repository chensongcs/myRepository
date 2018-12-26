package com.chensong.mapper;

import org.springframework.stereotype.Repository;

import com.chensong.bean.Student;

@Repository
public interface StudentMapper {
	void addStudent(Student student);
}
