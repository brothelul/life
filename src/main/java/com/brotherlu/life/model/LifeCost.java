package com.brotherlu.life.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "life_cost")
public class LifeCost {
    @Id
    @Column(name = "cost_no")
    private Integer costNo;

    @Column(name = "user_no")
    private Integer userNo;

    /**
     * type_no
     */
    @Column(name = "cost_type")
    private Integer costType;

    @Column(name = "cost_money")
    private Float costMoney;

    @Column(name = "cost_date")
    private Date costDate;

    @Column(name = "cost_desc")
    private String costDesc;

    @Column(name = "entry_id")
    private Integer entryId;

    @Column(name = "entry_date")
    private Date entryDate;

    @Column(name = "update_id")
    private Integer updateId;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "delete_id")
    private Integer deleteId;

    @Column(name = "delete_date")
    private Date deleteDate;

    /**
     * @return cost_no
     */
    public Integer getCostNo() {
        return costNo;
    }

    /**
     * @param costNo
     */
    public void setCostNo(Integer costNo) {
        this.costNo = costNo;
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
     * 获取type_no
     *
     * @return cost_type - type_no
     */
    public Integer getCostType() {
        return costType;
    }

    /**
     * 设置type_no
     *
     * @param costType type_no
     */
    public void setCostType(Integer costType) {
        this.costType = costType;
    }

    /**
     * @return cost_money
     */
    public Float getCostMoney() {
        return costMoney;
    }

    /**
     * @param costMoney
     */
    public void setCostMoney(Float costMoney) {
        this.costMoney = costMoney;
    }

    /**
     * @return cost_date
     */
    public Date getCostDate() {
        return costDate;
    }

    /**
     * @param costDate
     */
    public void setCostDate(Date costDate) {
        this.costDate = costDate;
    }

    /**
     * @return cost_desc
     */
    public String getCostDesc() {
        return costDesc;
    }

    /**
     * @param costDesc
     */
    public void setCostDesc(String costDesc) {
        this.costDesc = costDesc;
    }

    /**
     * @return entry_id
     */
    public Integer getEntryId() {
        return entryId;
    }

    /**
     * @param entryId
     */
    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
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
     * @return update_id
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * @param updateId
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return delete_id
     */
    public Integer getDeleteId() {
        return deleteId;
    }

    /**
     * @param deleteId
     */
    public void setDeleteId(Integer deleteId) {
        this.deleteId = deleteId;
    }

    /**
     * @return delete_date
     */
    public Date getDeleteDate() {
        return deleteDate;
    }

    /**
     * @param deleteDate
     */
    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }
}