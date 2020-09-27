package com.njm.service;

import com.alibaba.dubbo.config.annotation.Reference;
import demo.service.DemoService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import com.njm.dao.UserDao;
import com.njm.domain.User;

import javax.annotation.PostConstruct;

import static sun.misc.Version.println;

/**
 * 功能概要：UserService实现类
 * 
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Reference
	private DemoService helloService;

	@PostConstruct
	public void postConstruct(){
		System.out.println("postConstruct");
	}

	public User selectUserById(Integer userId) {
		/*System.out.println(helloService.sayHello());*/
		return userDao.selectUserById(userId);
		
	}


}
