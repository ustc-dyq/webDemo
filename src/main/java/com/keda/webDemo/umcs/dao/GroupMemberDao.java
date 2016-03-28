/**
 * @Title：GroupMemberDao.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.dao;

import java.util.List;

import com.keda.webDemo.umcs.dao.dto.GroupMember;

public interface GroupMemberDao {

	public GroupMember select(int id);
	public List<GroupMember> selectByGroupId(int groupId);
	public GroupMember selectByUserId(int userId);
	public int insert(GroupMember groupMember);
	public int update(GroupMember groupMember);
	public int delete(GroupMember groupMember);
	
}





