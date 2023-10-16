package com.bezahive.symplifica.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "groupmessage_table")
public class GroupMessage {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private long groupId;
    private long userId;
    private String message;
    private int type;
    private int status;
    private Date createdAt;
    private Date updatedAt;



//    CONSTRAINT `fk_gmessage_group`
//    FOREIGN KEY (`groupId`)
//    REFERENCES `sns`.`group` (`id`)
//    ON DELETE NO ACTION
//    ON UPDATE NO ACTION);
//
//    ALTER TABLE `sns`.`group_message`
//    ADD INDEX `idx_gmessage_user` (`userId` ASC);
//    ALTER TABLE `sns`.`group_message`
//    ADD CONSTRAINT `fk_gmessage_user`
//    FOREIGN KEY (`userId`)
//    REFERENCES `sns`.`user` (`id`)
//    ON DELETE NO ACTION
//    ON UPDATE NO ACTION;


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
