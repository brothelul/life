package com.brotherlu.life.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "life_group_notice")
public class LifeGroupNotice {
    @Id
    @Column(name = "notice_no")
    private Integer noticeNo;

    @Column(name = "type_no")
    private Integer typeNo;

    @Column(name = "notice_name")
    private String noticeName;

    @Column(name = "active")
    private String active;

    @Column(name = "entry_id")
    private Integer entryId;

    @Column(name = "entry_date")
    private Date entryDate;

    @Column(name = "notice_content")
    private String noticeContent;

    /**
     * @return notice_no
     */
    public Integer getNoticeNo() {
        return noticeNo;
    }

    /**
     * @param noticeNo
     */
    public void setNoticeNo(Integer noticeNo) {
        this.noticeNo = noticeNo;
    }

    /**
     * @return group_no
     */
    public Integer getTypeNo() {
        return typeNo;
    }

    /**
     * @param groupNo
     */
    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

    /**
     * @return notice_name
     */
    public String getNoticeName() {
        return noticeName;
    }

    /**
     * @param noticeName
     */
    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    /**
     * @return active
     */
    public String getActive() {
        return active;
    }

    /**
     * @param active
     */
    public void setActive(String active) {
        this.active = active;
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
     * @return notice_content
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * @param noticeContent
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
}