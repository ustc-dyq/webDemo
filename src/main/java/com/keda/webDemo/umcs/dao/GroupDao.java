/**
 * @Title：GroupDao.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.dao;

import java.util.List;

import com.keda.webDemo.umcs.dao.dto.Group;

public interface GroupDao {

	public Group select(int id);
	public List<Group> selectAll();
	public Group selectByGroupName(String groupName);
	public int insert(Group group);
	public int update(Group group);
	public int deleteByGroupName(String groupName);
	
}





