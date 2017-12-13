package com.brotherlu.life.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "life_cost_clean")
public class LifeCostClean {
    @Id
    @Column(name = "clean_no")
    private Integer cleanNo;

    @Column(name = "type_no")
    private Integer typeNo;

    @Column(name = "clean_desc")
    private String cleanDesc;

    @Column(name = "clean_date")
    private Date cleanDate;

    @Column(name = "entry_id")
    private Integer entryId;

    @Column(name = "entry_date")
    private Date entryDate;

    /**
     * @return clean_no
     */
    public Integer getCleanNo() {
        return cleanNo;
    }

    /**
     * @param cleanNo
     */
    public void setCleanNo(Integer cleanNo) {
        this.cleanNo = cleanNo;
    }

    /**
     * @return type_no
     */
    public Integer getTypeNo() {
        return typeNo;
    }

    /**
     * @param typeNo
     */
    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

    /**
     * @return clean_desc
     */
    public String getCleanDesc() {
        return cleanDesc;
    }

    /**
     * @param cleanDesc
     */
    public void setCleanDesc(String cleanDesc) {
        this.cleanDesc = cleanDesc;
    }

    /**
     * @return clean_date
     */
    public Date getCleanDate() {
        return cleanDate;
    }

    /**
     * @param cleanDate
     */
    public void setCleanDate(Date cleanDate) {
        this.cleanDate = cleanDate;
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
}