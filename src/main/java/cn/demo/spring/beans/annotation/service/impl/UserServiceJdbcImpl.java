package cn.demo.spring.beans.annotation.service.impl;

import cn.demo.spring.beans.annotation.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceJdbcImpl implements UserService {

	@Override
	public void save() {
		System.out.println("UserServiceJdbcImpl save...");
	}


}
