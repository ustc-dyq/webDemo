/**
 * @Title：Login.java 
 * @Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description: 用户登陆信息
**/
package com.keda.webDemo.umcs.dao.dto;

public class Login {

	private int id;
	private int userId;         //用户id
	private String userName;    //用户名
	private int isOnline;       //是否在线，0不在线，1在线
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
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * @return the isOnline
	 */
	public int getIsOnline() {
		return isOnline;
	}
	
	/**
	 * @param isOnline the isOnline to set
	 */
	public void setIsOnline(int isOnline) {
		this.isOnline = isOnline;
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





