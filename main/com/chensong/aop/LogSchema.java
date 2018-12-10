package com.chensong.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 基于schema配置实现通知
 * @author Administrator
 *
 */
@Component("logSchema")
public class LogSchema {
	//后置通知方法
	public void afterReturning(JoinPoint jp,Object returnValue){
		System.out.println("Schema:后置通知");
	}
	
	//前置通知方法
	public void before(JoinPoint jp){
		System.out.println("Schema:前置通知");
	}
	
	//异常通知方法
	public void whenException(JoinPoint jp,NullPointerException e){
		System.out.println("Schema:异常通知");
	}
	
	//环绕通知方法
	public Object around(ProceedingJoinPoint jp){
		System.out.println("Schema:环绕通知----前置通知");
		Object result = null;
		try {
			result = jp.proceed();
			System.out.println("Schema:环绕通知----后置通知");
		} catch (Throwable e) {
			System.out.println("Schema:环绕通知----异常通知");
		}
		return result;
	}
}
