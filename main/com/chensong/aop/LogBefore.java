package com.chensong.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

/**
 * ��ͨ��->ǰ��֪ͨ
 * @author Administrator
 *
 */
@Component("logBefore")
public class LogBefore implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("ǰ��֪ͨ...");
	}
}
