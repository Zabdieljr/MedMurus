package com.bezahive.symplifica.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="friend_table")
public class Friend {


    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long sourceId;
    private long targetId;
    private Integer type;
    private Integer status;
    private Date createdAt;
    private Date updatedAt;
    private String notes;

    public Friend() {
    }

    public Friend(Long id, long sourceId, long targetId, Integer type, Integer status, Date createdAt, Date uodatedAt, String notes) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.type = type;
        this.status = status;
        this.createdAt = createdAt;
        updatedAt = uodatedAt;
        this.notes = notes;
    }

    public long getSourceId() {
        return sourceId;
    }

    public void setSourceId(long sourceId) {
        this.sourceId = sourceId;
    }

    public long getTargetId() {
        return targetId;
    }

    public void setTargetId(long targetId) {
        this.targetId = targetId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", sourceId=" + sourceId +
                ", targetId=" + targetId +
                ", type=" + type +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", UodatedAt=" + updatedAt +
                ", notes='" + notes + '\'' +
                '}';
    }
}
