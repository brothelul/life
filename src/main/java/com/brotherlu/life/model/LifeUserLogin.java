package com.brotherlu.life.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "life_user_login")
public class LifeUserLogin {
    @Id
    @Column(name = "user_no")
    private Integer userNo;

    @Column(name = "login_name")
    private String loginName;

    private String password;

    @Column(name = "login_ip")
    private String loginIp;

    @Column(name = "login_date")
    private Date loginDate;

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
     * @return login_name
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return login_ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * @param loginIp
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * @return login_date
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * @param loginDate
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}