package cn.demo.spring.aop.aspect.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("aspect-annotation.xml");
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculatorImpl");
		int result = arithmeticCalculator.add(4, 5);
		System.out.println("----->"+result);
		result = arithmeticCalculator.div(100,10);
		System.out.println("----->"+result);
	}

}
