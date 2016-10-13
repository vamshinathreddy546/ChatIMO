package com.niit.service;

import javax.servlet.http.HttpSession;

import com.niit.models.userdetails;

public interface Userservicedao {
public void save(userdetails user);
public void delete(userdetails user);
public void getuname(HttpSession session);
public void LoginSuccess(HttpSession session);




}
