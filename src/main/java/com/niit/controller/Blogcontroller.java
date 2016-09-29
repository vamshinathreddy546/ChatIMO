package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.models.Blog;
import com.niit.service.blogservicedao;

@RestController
public class Blogcontroller {
	
	@Autowired
	private blogservicedao blogService;

	@PostMapping("/Blog")
	public void CreateBlog(@RequestBody Blog blog) 
	{
		blogService.create(blog);
	}
	
}
