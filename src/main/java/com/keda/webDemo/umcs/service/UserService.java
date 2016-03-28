/**
 * @Title：UserService.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.service;

import java.util.List;

import com.keda.webDemo.umcs.dao.dto.User;

public interface UserService {
	
	public boolean verify(User user);
	public void login(User user);
	public void addUser(User user);
	public List<User> getAllUser();
	public List<User> getGroupUsers();
	

}





