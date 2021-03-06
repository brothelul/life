package com.brotherlu.life.model;

import java.math.BigDecimal;

public class LifeTotalCost {
	private Integer userNo;
	private String username;
	private Integer groupNo;
	private String groupName;
	private Integer typeNo;
	private String typeName;
	private BigDecimal totalCost;
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
	public Integer getTypeNo() {
		return typeNo;
	}
	public void setTypeNo(Integer typeNo) {
		this.typeNo = typeNo;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTotalCost() {
		return totalCost.toString();
	}
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}
	
}
