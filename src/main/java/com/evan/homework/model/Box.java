package com.evan.homework.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Box {

    @Column(insertable = false, updatable = false)
    private long sequence;
    @Id
    private String id;
    @Column(insertable = false, updatable = false)
    private Date createTime;


    public long getSequence() {
        return sequence;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }


    @Override
    public String toString() {
        return "Box{" +
                "sequence=" + sequence +
                ", id='" + id + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}