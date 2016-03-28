/**
 * @Title：UserDao.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.dao;

import java.util.List;

import com.keda.webDemo.umcs.dao.dto.User;

public interface UserDao {

	public int insert(User user);
	public int update(User user);
	public User select(int id);
	public List<User> selectAll();
	public User select(User user);
	int deleteByUserName(String userName);
	
}





