package com.bezahive.symplifica.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="user_follower")
public class Follower {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private long sourceId;
    private long targetId;

    private Integer type;

    private Date createdAt;
    private Date updatedAt;

    public Follower() {
    }

    public Follower(Long id, long sourceId, long targetId, Integer type, Date createdAt, Date updatedAt) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.type = type;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", sourceId=" + sourceId +
                ", targetId=" + targetId +
                ", type=" + type +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
