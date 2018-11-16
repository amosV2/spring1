package cn.demo.spring.aop.aspect.xml;


import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspect {

	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("method " + methodName + " begins with " + args);
	}

	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("method " + methodName + " ends");

	}

	public void returningMethod(JoinPoint joinPoint,Object result){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("method " + methodName + " returns "+result);
	}

	public void throwingMethod(JoinPoint joinPoint,Exception ex){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("method " + methodName + " throws exception "+ex);
	}


	public Object around(ProceedingJoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		Object result = null;
		try {
			//前置
			System.out.println(methodName+" begins with " + Arrays.asList(joinPoint.getArgs()));
			result = joinPoint.proceed(args);
			//返回
			System.out.println(methodName+" returns " + result);
		}
		catch (Throwable e) {
			//异常
			System.out.println(methodName + " throws exception" + e);
		}
		//后置
		System.out.println(methodName + " ends with " + result);
		return result;
	}

}

