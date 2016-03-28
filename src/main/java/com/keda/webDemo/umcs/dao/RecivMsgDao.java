/**
 * @Title：RecivMsgDao.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.dao;

import java.util.List;

import com.keda.webDemo.umcs.dao.dto.RecivMsg;

public interface RecivMsgDao {

	public RecivMsg select(int id);
	public List<RecivMsg> selectByUser(RecivMsg recivMsg);
	public int insert(RecivMsg recivMsg);
	public int delete(RecivMsg recivMsg);
	
}





