package com.chensong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Component("logException")
public class LogException implements ThrowsAdvice{
	public void afterThrowing(Method method,Object[] args,Object target,Throwable ex){
		System.out.println("�쳣֪ͨ��Ŀ�����"+target+",��������"+method.getName()+",�����Ĳ���������"+args.length+",�쳣���ͣ�"+ex.getMessage());
	}
}
