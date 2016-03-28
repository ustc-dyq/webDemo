/**
 * @Title：Group.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description: 分组信息
**/
package com.keda.webDemo.umcs.dao.dto;

import java.util.Date;

public class Group {

	private int id;
	private String groupName;       //分组名
	private String addUserName;     //创建人名称
	private Date addTime;	        //创建时间
	private int delFlag;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	/**
	 * @return the addUserName
	 */
	public String getAddUserName() {
		return addUserName;
	}
	
	/**
	 * @param addUserName the addUserName to set
	 */
	public void setAddUserName(String addUserName) {
		this.addUserName = addUserName;
	}
	
	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return addTime;
	}
	
	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
	/**
	 * @return the delFlag
	 */
	public int getDelFlag() {
		return delFlag;
	}
	
	/**
	 * @param delFlag the delFlag to set
	 */
	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}
	
}





