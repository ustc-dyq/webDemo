/**
 * @Title：LoginDao.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.dao;

import java.util.List;

import com.keda.webDemo.umcs.dao.dto.Login;

public interface LoginDao {

	public Login select(int id);
	public List<Login> selectAll();
	public Login selectByUser(Login login);
	public int insert(Login login);
	public int update(Login login);
	public int deleteByUserId(int userId);
	
}





