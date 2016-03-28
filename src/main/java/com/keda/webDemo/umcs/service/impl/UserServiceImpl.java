/**
 * @Title：UserServiceImpl.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.keda.webDemo.umcs.dao.UserDao;
import com.keda.webDemo.umcs.dao.dto.User;
import com.keda.webDemo.umcs.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	/* (non-Javadoc)
	 * @see com.keda.webDemo.umcs.service.UserService#verify(com.keda.webDemo.umcs.dao.dto.User)
	 */
	@Override
	public boolean verify(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.keda.webDemo.umcs.service.UserService#login(com.keda.webDemo.umcs.dao.dto.User)
	 */
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.keda.webDemo.umcs.service.UserService#addUser(com.keda.webDemo.umcs.dao.dto.User)
	 */
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.keda.webDemo.umcs.service.UserService#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		
		return userDao.selectAll();
		
	}

	/* (non-Javadoc)
	 * @see com.keda.webDemo.umcs.service.UserService#getGroupUsers()
	 */
	@Override
	public List<User> getGroupUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}





