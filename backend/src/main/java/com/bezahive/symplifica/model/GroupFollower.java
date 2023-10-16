package com.bezahive.symplifica.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "groupfollower_table")
public class GroupFollower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long groupId;
    private long userId;
    private int type;
    private int status;
    private Date createdAt;
    private Date updatedAt;

//CONSTRAINT `fk_gfollower_group`
//    FOREIGN KEY (`groupId`)


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
