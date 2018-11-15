package cn.demo.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*Person person = (Person) ctx.getBean("p");
		System.out.println(person);*/

		/*NewPerson newPerson = (NewPerson) ctx.getBean("newPerson");
		System.out.println(newPerson);*/

		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);

		Person person = (Person) ctx.getBean("p5");
		System.out.println(person);

	}

}
