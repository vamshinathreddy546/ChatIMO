package com.niit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.service.forumservicedao;

@Controller
public class Navigate {
	
	
	@SuppressWarnings("unused")
	@Autowired
	private forumservicedao forumService;
	
	@RequestMapping(value={"/","/home"})
	public String Homepage()
	{
		return "home";
	}
	
	
	
	@RequestMapping("Blog")
	public String Blog(Model m)
	{
		m.addAttribute("BlogClicked", "true");
		return "home";
	}
	
	@RequestMapping("forum")
	public String Forum(Model m)
	{
		m.addAttribute("ForumClicked", "true");
		return "home";
	}
	@RequestMapping("userdetails")
	public String Userdetails(Model m)
	{
		m.addAttribute("LoginClicked", "true");
		return "home";
	}
}