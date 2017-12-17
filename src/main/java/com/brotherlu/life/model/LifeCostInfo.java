package com.brotherlu.life.model;

import java.math.BigDecimal;
import java.util.Date;

import com.brotherlu.life.framework.constants.CommonConstant;
import com.brotherlu.life.utils.DateFormatUtil;

public class LifeCostInfo {
	private Integer costNo;
	private Integer userNo;
	private String username;
	private Integer phone;
	private BigDecimal costMoney;
	private String costDesc;
	private Date costDate;
	private Integer costType;
	private String typeName;
	private Integer groupNo;
	private String groupName;
	private Integer entryId;
	private Date entryDate;
	public Integer getCostNo() {
		return costNo;
	}
	public void setCostNo(Integer costNo) {
		this.costNo = costNo;
	}
	public Integer getUserNo() {
		return userNo;
	}
	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getCostMoney() {
		return costMoney.toString();
	}
	public void setCostMoney(BigDecimal costMoney) {
		this.costMoney = costMoney;
	}
	public String getCostDesc() {
		return costDesc;
	}
	public void setCostDesc(String costDesc) {
		this.costDesc = costDesc;
	}
	public String getCostDate() {
		
		return DateFormatUtil.date2String(costDate, CommonConstant.DATE_PATTERN);
	}
	public void setCostDate(Date costDate) {
		this.costDate = costDate;
	}
	public Integer getCostType() {
		return costType;
	}
	public void setCostType(Integer costType) {
		this.costType = costType;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getGroupNo() {
		return groupNo;
	}
	public void setGroupNo(Integer groupNo) {
		this.groupNo = groupNo;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getEntryId() {
		return entryId;
	}
	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}
	public String getEntryDate() {
		return DateFormatUtil.date2String(entryDate, CommonConstant.DATE_PATTERN);
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
}
