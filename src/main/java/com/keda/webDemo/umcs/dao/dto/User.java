/**
 * @Title：User.java 
 * @Copyright：Copyright © Suzhou Keda Technology Co.Ltd. All Rights Reserved. 
 * @author： 代永强
 * @date: 2016年3月28日
 * @description: 用户信息
**/
package com.keda.webDemo.umcs.dao.dto;

import java.util.Date;

public class User {

	private int id;
	private String userName;     //用户名
	private String userPasswd;   //用户密码
	private int userPriv;        //用户权限，0是普通用户，1是管理员
	private Date addTime;        //添加时间
	private Date updateTime;     //更新时间
	private int delFlag;         //删除标记
	
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
	 * @return the userPasswd
	 */
	public String getUserPasswd() {
		return userPasswd;
	}
	
	/**
	 * @param userPasswd the userPasswd to set
	 */
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
	
	/**
	 * @return the userPriv
	 */
	public int getUserPriv() {
		return userPriv;
	}
	
	/**
	 * @param userPriv the userPriv to set
	 */
	public void setUserPriv(int userPriv) {
		this.userPriv = userPriv;
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
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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





