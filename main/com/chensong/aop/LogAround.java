package com.chensong.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("logAround")
public class LogAround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//������1...
		try {
			//������2...
			System.out.println("�û���֪ͨʵ�ֵġ�ǰ��֪ͨ��...");
			//invocation.proceed()֮ǰ�Ĵ��룺ǰ��֪ͨ
			Object result = invocation.proceed();//������Ŀ�귽����ִ��--addStudent();
			//result ����Ŀ�귽��addStudent()�����ķ���ֵ
			//invocation.proceed()֮��Ĵ��룺����֪ͨ
			System.out.println("�û���֪ͨʵ�ֵġ�����֪ͨ��...");
			System.out.println("����֪ͨ:�ĸ�Ŀ�����"+invocation.getThis()+",���õķ�������"+invocation.getMethod().getName()+",�����Ĳ���������"+invocation.getArguments().length+",�����ķ���ֵ��"+result);
		} catch (Exception e) {
			//������3...
			//�쳣֪ͨ
			System.out.println("�û���֪ͨʵ�ֵġ��쳣֪ͨ��...");
		}
		return true;
	}
	
}
