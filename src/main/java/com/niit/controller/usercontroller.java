package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.niit.models.userdetails;
import com.niit.service.Userservicedao;

public class usercontroller {
	@Autowired
	private Userservicedao userservicedao;
	@PostMapping("/userdetails")
	public void savedetails(@RequestBody userdetails user)
	{
		userservicedao.save(user);
	}
	

}
