package com.chensong.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * ����schema����ʵ��֪ͨ
 * @author Administrator
 *
 */
@Component("logSchema")
public class LogSchema {
	//����֪ͨ����
	public void afterReturning(JoinPoint jp,Object returnValue){
		System.out.println("Schema:����֪ͨ");
	}
	
	//ǰ��֪ͨ����
	public void before(JoinPoint jp){
		System.out.println("Schema:ǰ��֪ͨ");
	}
	
	//�쳣֪ͨ����
	public void whenException(JoinPoint jp,NullPointerException e){
		System.out.println("Schema:�쳣֪ͨ");
	}
	
	//����֪ͨ����
	public Object around(ProceedingJoinPoint jp){
		System.out.println("Schema:����֪ͨ----ǰ��֪ͨ");
		Object result = null;
		try {
			result = jp.proceed();
			System.out.println("Schema:����֪ͨ----����֪ͨ");
		} catch (Throwable e) {
			System.out.println("Schema:����֪ͨ----�쳣֪ͨ");
		}
		return result;
	}
}
