package cn.demo.spring.beans.annotation;

import cn.demo.spring.beans.annotation.controller.UserController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");

		UserController userController = (UserController) ctx.getBean("userController");
		userController.add();

	}

}
