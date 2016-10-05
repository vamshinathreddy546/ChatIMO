package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.niit.dao.Forumdao;
import com.niit.models.Forum;


@Service
public class forumservicedaoimpl implements forumservicedao {
	@Autowired
	Forumdao forumdao;

	public void create(Forum forum) {
		forumdao.save(forum);
		
	}

	public void delete(int id) {
		Forum forum = forumdao.getforum(id);
		forumdao.delete(forum);
		
	}

	public String allforums() {
		List<Forum> list=forumdao.allforums();
		Gson gson=new Gson();
	    String s=gson.toJson(list);
	    return s;
	
	}


	@Override
	public Forum editforum(int id) {
		return forumdao.getforum(id);
		
	}
		
	}


