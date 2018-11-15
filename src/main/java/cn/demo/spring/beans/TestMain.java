package cn.demo.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
/*
		HelloWorld bean = (HelloWorld) ctx.getBean("helloWorld");
		bean.say();
*/
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);

		car = (Car) ctx.getBean("car2");
		System.out.println(car);

		Person person = (Person) ctx.getBean("person");
		System.out.println(person);

	}

}
