package com.niit.service;


import com.niit.models.Forum;

public interface forumservicedao {
	public void create(Forum forum);
	public void delete(int id);
	public String allforums();
	public Forum editforum(int id);
	
	
	

}
