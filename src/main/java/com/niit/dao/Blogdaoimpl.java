package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.Blog;
@Repository
public class Blogdaoimpl implements Blogdao {
	@Autowired
	private SessionFactory sessionfactory;
	
@Transactional
	public void save(Blog blog) {
		sessionfactory.getCurrentSession().saveOrUpdate(blog);
		
		
	}

public void delete(Blog blog) {
	sessionfactory.getCurrentSession().delete(blog);
	
	
}

public List<Blog> allblogs() {
	Criteria c = sessionfactory.getCurrentSession().createCriteria(Blog.class);
	
	List<Blog> list = c.list();
	
	return list;
}

public Blog getblog(int bid) {
	Criteria c= sessionfactory.getCurrentSession().createCriteria(Blog.class);
	c.add(Restrictions.eq("id","bid"));
	Blog blog = (Blog) c.uniqueResult();
	return blog;
}

}
