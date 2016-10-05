package com.niit.service;

import com.niit.models.Blog;

public interface blogservicedao {
	public void create(Blog blog); 
	public void delete(int id);
	public String allblogs();
	public Blog editblog(int id);
	
	
	

}
