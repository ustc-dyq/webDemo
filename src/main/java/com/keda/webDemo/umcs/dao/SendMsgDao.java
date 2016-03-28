/**
 * @Title：SendMsgDao.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.dao;

import java.util.List;

import com.keda.webDemo.umcs.dao.dto.SendMsg;

public interface SendMsgDao {

	public SendMsg select(int id);
	public List<SendMsg> selectByUser(SendMsg sendMsg);
	public int insert(SendMsg sendMsg);
	public int delete(SendMsg sendMsg);
	
}





