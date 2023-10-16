package com.bezahive.symplifica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "grouppost_tabel")
public class GroupPost {


    @Id
    @GeneratedValue
    private long id;

    private long groupId;
    private long userId;
    private String message;
    private int type;
    private int status;
    private Date createdAt;
    private Date updatedAt;

    /* CONSTRAINT `fk_gpost_group`
    FOREIGN KEY (`groupId`)
    REFERENCES `sns`.`group` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

    ALTER TABLE `sns`.`group_post`
    ADD INDEX `idx_gpost_user` (`userId` ASC);
    ALTER TABLE `sns`.`group_post`
    ADD CONSTRAINT `fk_gpost_user`
    FOREIGN KEY (`userId`)*/

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
