package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.models.Forum;

@Repository
public class Forumdaoimpl implements Forumdao {
	
	@Autowired
	private SessionFactory sessionfactory;
	
@Transactional
	public void save(Forum forum) {
		sessionfactory.getCurrentSession().saveOrUpdate(forum);
		
		
	}
@Transactional
public void delete(Forum forum) {
	sessionfactory.getCurrentSession().delete(forum);
	
	
}
@SuppressWarnings("unchecked")
@Transactional
public List<Forum> allforums() {
	@SuppressWarnings("deprecation")
	Criteria d = sessionfactory.getCurrentSession().createCriteria(Forum.class);
	
	List<Forum> list = d.list();
	
	return list;
}
@Transactional
public Forum getforum(int id) {
	@SuppressWarnings("deprecation")
	Criteria d= sessionfactory.getCurrentSession().createCriteria(Forum.class);
	d.add(Restrictions.eq("id",id));
	Forum forum = (Forum) d.uniqueResult();
	return forum;
}

}



