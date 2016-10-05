package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.Userdao;
import com.niit.models.userdetails;

@Service
public class Userservicedaoimpl implements Userservicedao{
@Autowired	
Userdao userdao;
public void save(userdetails user)
{
	user.setEnabled("1");
	user.setRole_name("Role_user");
}
}
