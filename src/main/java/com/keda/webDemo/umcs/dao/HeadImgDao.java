/**
 * @Title：HeadImgDao.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description:
**/
package com.keda.webDemo.umcs.dao;

import com.keda.webDemo.umcs.dao.dto.HeadImg;

public interface HeadImgDao {

	public HeadImg select(int id);
	public HeadImg selectByUser(HeadImg headImg);
	public int insert(HeadImg headImg);
	public int update(HeadImg headImg);
	public int delete(HeadImg headImg);
	
}





