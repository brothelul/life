package com.brotherlu.life.model;

import javax.persistence.*;

@Table(name = "life_user_group")
public class LifeUserGroup {
	@Id
    @Column(name = "group_no")
    private Integer groupNo;

    @Column(name = "user_no")
    private Integer userNo;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "group_desc")
    private String groupDesc;

    /**
     * @return group_no
     */
    public Integer getGroupNo() {
        return groupNo;
    }

    /**
     * @param groupNo
     */
    public void setGroupNo(Integer groupNo) {
        this.groupNo = groupNo;
    }

    /**
     * @return user_no
     */
    public Integer getUserNo() {
        return userNo;
    }

    /**
     * @param userNo
     */
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    /**
     * @return group_name
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return group_desc
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * @param groupDesc
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }
}