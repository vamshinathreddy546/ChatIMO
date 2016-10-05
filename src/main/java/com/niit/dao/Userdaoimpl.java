package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.userdetails;

@Repository
public class Userdaoimpl implements Userdao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save(userdetails user)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

}
