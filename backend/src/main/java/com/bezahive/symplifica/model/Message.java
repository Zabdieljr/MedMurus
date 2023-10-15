package com.bezahive.symplifica.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="user_message")
public class Message {

        @Id()
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private long sourceId;
        private long targetId;
        private String message;

        private Date createdAt;
        private Date updatedAt;

    public Message() {
    }

    public Message(Long id, long sourceId, long targetId, String message, Date createdAt, Date updatedAt) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.message = message;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        return "Message{" +
                "id=" + id +
                ", sourceId=" + sourceId +
                ", targetId=" + targetId +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
