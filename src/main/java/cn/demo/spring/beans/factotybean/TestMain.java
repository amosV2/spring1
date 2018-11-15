package cn.demo.spring.beans.factotybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factorybean.xml");
		Car car = (Car) ctx.getBean("car9");
		System.out.println(car);
	}

}
