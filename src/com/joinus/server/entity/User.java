package com.joinus.server.entity;

import java.util.Date;

/**
 * 用户信息<br>
 * @author henrybit
 * @version 1.0
 * @since 2013-4-5
 */
public class User {
	/**用户ID*/
	private String id;
	/**用户昵称*/
	private String name;
	/**用户密码*/
	private String password;
	/**用户性别:1-男,2-女,3-人妖*/
	private int sex;
	/**用户本地头像图片地址*/
	private String localPicUrl;
	/**用户头像图片*/
	private String picUrl;
	/**用户手机号*/
	private String phoneNo;
	/**用户设备ID*/
	private String deviceNo;
	/**用户创建时间:LONG*/
	private long createTimeLong;
	/**用户创建:DATE*/
	private Date createTime;
	/**用户最近一次登陆时间:LONG*/
	private long updateTimeLong;
	/**用户最近一次登陆时间:DATE*/
	private Date updateTime;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * @return the deviceNo
	 */
	public String getDeviceNo() {
		return deviceNo;
	}
	/**
	 * @param deviceNo the deviceNo to set
	 */
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	/**
	 * @return the picUrl
	 */
	public String getPicUrl() {
		return picUrl;
	}
	/**
	 * @param picUrl the picUrl to set
	 */
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	/**
	 * @return the createTimeLong
	 */
	public long getCreateTimeLong() {
		return createTimeLong;
	}
	/**
	 * @param createTimeLong the createTimeLong to set
	 */
	public void setCreateTimeLong(long createTimeLong) {
		this.createTimeLong = createTimeLong;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the updateTimeLong
	 */
	public long getUpdateTimeLong() {
		return updateTimeLong;
	}
	/**
	 * @param updateTimeLong the updateTimeLong to set
	 */
	public void setUpdateTimeLong(long updateTimeLong) {
		this.updateTimeLong = updateTimeLong;
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
	 * @return the localPicUrl
	 */
	public String getLocalPicUrl() {
		return localPicUrl;
	}
	/**
	 * @param localPicUrl the localPicUrl to set
	 */
	public void setLocalPicUrl(String localPicUrl) {
		this.localPicUrl = localPicUrl;
	}
	
}
