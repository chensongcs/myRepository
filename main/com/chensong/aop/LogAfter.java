package com.chensong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component("logAfter")
public class LogAfter implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2,
			Object target) throws Throwable {
		System.out.println("后置通知:哪个目标对象："+target+",调用的方法名："+method.getName()+",方法的参数个数："+arg2.length+",方法的返回值："+returnValue);
	}
	
}
