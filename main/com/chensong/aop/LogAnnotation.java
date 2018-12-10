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
 * 使用注解方法实现通知
 * @author Administrator
 *
 */

@Component("logAnnotation")
@Aspect//该类是一个通知,@Aspect不需要加入扫描器
public class LogAnnotation {
	
	@Before("execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")//属性：定义切点
	public void myBefore(JoinPoint jp){
		System.out.println("<<前置通知--注解实现方式>>");
	}
	
	@AfterReturning(returning="returningValue",pointcut="execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void myAfter(JoinPoint jp,Object returningValue){//returningValue是返回值，但需要告诉程序
		System.out.println("<<后置通知--注解实现方式>>:目标对象："+jp.getTarget()+",方法名："+jp.getSignature().getName()+",参数列表："+Arrays.toString(jp.getArgs())+",返回值："+returningValue);
	}
	
	@AfterThrowing(throwing="e",pointcut="execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void myException(JoinPoint jp,NullPointerException e){
		//只捕获空指针异常
		System.out.println("<<异常通知--注解实现方式--e:"+e.getMessage());
	}
	
	@Around("execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void myAround(ProceedingJoinPoint jp){
		//方法执行前：前置通知
		System.out.println("【环绕】<<方法之前：前置通知>>");
		try {
			//方法执行时：
			jp.proceed();
			//方法执行后：后置通知
			System.out.println("【环绕】<<方法之后：后置通知>>");
		} catch (Throwable e) {
			//发生异常时：异常通知
			System.out.println("【环绕】<<发生异常：异常通知>>");
		}finally{
			//最终通知
			System.out.println("【环绕】<<最终通知>>");
		}
	}
	
	//最终通知
	@After("execution(public boolean com.chensong.service.impl.StudentServiceImpl.addStudent(com.chensong.bean.Student))")
	public void after(){
		System.out.println("<<最终通知>>--注解实现形式");
	}
}
