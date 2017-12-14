package com.brotherlu.life.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "life_user_info")
public class LifeUserInfo {
    @Id
    @Column(name = "user_no")
    private Integer userNo;

    @Column(name = "username")
    private String username;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "email")
    private String email;

    @Column(name = "entry_date")
    private Date entryDate;

    @Column(name = "entry_ip")
    private String entryIp;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return phone
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return entry_date
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return entry_ip
     */
    public String getEntryIp() {
        return entryIp;
    }

    /**
     * @param entryIp
     */
    public void setEntryIp(String entryIp) {
        this.entryIp = entryIp;
    }
}