package com.chensong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component("logAfter")
public class LogAfter implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2,
			Object target) throws Throwable {
		System.out.println("����֪ͨ:�ĸ�Ŀ�����"+target+",���õķ�������"+method.getName()+",�����Ĳ���������"+arg2.length+",�����ķ���ֵ��"+returnValue);
	}
	
}
