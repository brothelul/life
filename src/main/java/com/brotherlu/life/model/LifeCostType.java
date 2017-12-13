package com.brotherlu.life.model;

import javax.persistence.*;

@Table(name = "life_cost_type")
public class LifeCostType {
    @Id
    @Column(name = "type_no")
    private Integer typeNo;

    @Column(name = "type_name")
    private String typeName;

    @Column(name = "type_desc")
    private String typeDesc;

    @Column(name = "group_no")
    private Integer groupNo;

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
     * @return type_name
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * @return type_desc
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * @param typeDesc
     */
    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

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
}