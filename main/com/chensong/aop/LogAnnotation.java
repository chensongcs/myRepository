package com.chensong.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
 * ʹ��ע�ⷽ��ʵ��֪ͨ
 * @author Administrator
 *
 */

@Component("logAnnotation")
@Aspect//������һ��֪ͨ,@Aspect����Ҫ����ɨ����
public class LogAnnotation {
	
	@Before("execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")//���ԣ������е�
	public void myBefore(JoinPoint jp){
		System.out.println("<<ǰ��֪ͨ--ע��ʵ�ַ�ʽ>>");
	}
	
	@AfterReturning(returning="returningValue",pointcut="execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void myAfter(JoinPoint jp,Object returningValue){//returningValue�Ƿ���ֵ������Ҫ���߳���
		System.out.println("<<����֪ͨ--ע��ʵ�ַ�ʽ>>:Ŀ�����"+jp.getTarget()+",��������"+jp.getSignature().getName()+",�����б�"+Arrays.toString(jp.getArgs())+",����ֵ��"+returningValue);
	}
	
	@AfterThrowing(throwing="e",pointcut="execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void myException(JoinPoint jp,NullPointerException e){
		//ֻ�����ָ���쳣
		System.out.println("<<�쳣֪ͨ--ע��ʵ�ַ�ʽ--e:"+e.getMessage());
	}
	
	@Around("execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void myAround(ProceedingJoinPoint jp){
		//����ִ��ǰ��ǰ��֪ͨ
		System.out.println("�����ơ�<<����֮ǰ��ǰ��֪ͨ>>");
		try {
			//����ִ��ʱ��
			jp.proceed();
			//����ִ�к󣺺���֪ͨ
			System.out.println("�����ơ�<<����֮�󣺺���֪ͨ>>");
		} catch (Throwable e) {
			//�����쳣ʱ���쳣֪ͨ
			System.out.println("�����ơ�<<�����쳣���쳣֪ͨ>>");
		}finally{
			//����֪ͨ
			System.out.println("�����ơ�<<����֪ͨ>>");
		}
	}
	
	//����֪ͨ
	@After("execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void after(){
		System.out.println("<<����֪ͨ>>--ע��ʵ����ʽ");
	}
}
