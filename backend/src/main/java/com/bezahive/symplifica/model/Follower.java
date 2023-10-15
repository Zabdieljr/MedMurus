package com.bezahive.symplifica.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@Entity
@Table(name="user_follower")
public class Follower {
    @Id()
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private long sourceId;
    @NonNull
    private long targetId;

    private int type;

    private Date createdAt;
    private Date updatedAt;



    public long getId() {
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

    public int getType() {
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
