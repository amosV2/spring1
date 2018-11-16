package cn.demo.spring.aop.aspect.annotation;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(public int cn.demo.spring.aop.aspect.annotation.ArithmeticCalculator.*(int,int))")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("method " + methodName + " begins with " + args);
	}

	@After("execution(* cn.demo.spring.aop.aspect.annotation.ArithmeticCalculator.*(int,int))")
	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("method " + methodName + " ends");

	}

	@AfterReturning(value = "execution(* cn.demo.spring.aop.aspect.annotation.ArithmeticCalculator.*(int,int))",returning="result")
	public void returningMethod(JoinPoint joinPoint,Object result){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("method " + methodName + " returns "+result);
	}

	@AfterThrowing(value = "execution(* cn.demo.spring.aop.aspect.annotation.ArithmeticCalculator.*(int,int))",throwing = "ex")
	public void throwingMethod(JoinPoint joinPoint,Exception ex){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("method " + methodName + " throws exception "+ex);
	}


	@Around(value = "execution(* cn.demo.spring.aop.aspect.annotation.ArithmeticCalculator.*(int,int))")
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

