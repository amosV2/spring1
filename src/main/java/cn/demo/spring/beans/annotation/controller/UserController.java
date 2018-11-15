package cn.demo.spring.beans.annotation.controller;

import cn.demo.spring.beans.annotation.service.UserService;
import cn.demo.spring.beans.annotation.service.impl.UserServiceXmlImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

	@Autowired
	@Qualifier("userServiceJdbcImpl")
	private UserService userServiceXmlImpl;

	public void add(){
		System.out.println("UserController add...");
		userServiceXmlImpl.save();
	}

}
