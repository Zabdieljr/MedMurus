package com.bezahive.symplifica.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="group_table")
public class Group {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private long sourceId;
    private long targetId;
    private long createdBy;
    private long updatedBy;
    private String tittle;
    private String metaTittle;
    private String slug;

    private String summary;
    private Integer status;
    private String profile;
    private String content;
    private Date createdAt;
    private Date updatedAt;

    public Group() {
    }

    public Group(Long id, long sourceId, long targetId, long createdBy, long updatedBy, String tittle, String metaTittle, String slug, String summary, Integer status, String profile, String content, Date createdAt, Date updatedAt) {
        this.id = id;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.tittle = tittle;
        this.metaTittle = metaTittle;
        this.slug = slug;
        this.summary = summary;
        this.status = status;
        this.profile = profile;
        this.content = content;
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

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getMetaTittle() {
        return metaTittle;
    }

    public void setMetaTittle(String metaTittle) {
        this.metaTittle = metaTittle;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "Group{" +
                "id=" + id +
                ", sourceId=" + sourceId +
                ", targetId=" + targetId +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                ", tittle='" + tittle + '\'' +
                ", metaTittle='" + metaTittle + '\'' +
                ", slug='" + slug + '\'' +
                ", summary='" + summary + '\'' +
                ", status=" + status +
                ", profile='" + profile + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
