package cn.demo.spring.aop.aspect.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aspect-xml.xml");
		ArithmeticCalculator calculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
		int result = calculator.add(2,5);
		System.out.println(result);
		result = calculator.div(6,0);
		System.out.println(result);

	}

}
