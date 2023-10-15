package com.bezahive.symplifica.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="user_post")
public class User_Post {

    @Id()
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NonNull
    private long userId;
    @NonNull
    private long senderId;
    @Nullable
    private String message;
    @NonNull
    private Date createdAt;
    @NonNull
    private Date updatedAt;

    //foreign key
    @ManyToMany
    @JoinTable (name = "user_posts" , joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name ="postId"))
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public User_Post() {
    }

    public User_Post(long id, long userId, long senderId, @Nullable String message, @NonNull Date createdAt, @NonNull Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.senderId = senderId;
        this.message = message;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userID) {
        this.userId = userId;
    }

    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    @Nullable
    public String getMessage() {
        return message;
    }

    public void setMessage(@Nullable String message) {
        this.message = message;
    }

    @NonNull
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(@NonNull Date createdAt) {
        this.createdAt = createdAt;
    }

    @NonNull
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(@NonNull Date udatedAt) {
        this.updatedAt = udatedAt;
    }

    @Override
    public String toString() {
        return "User_Post{" +
                "id=" + id +
                ", userid=" + userId +
                ", senderId=" + senderId +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                ", udatedAt=" + updatedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User_Post userPost = (User_Post) o;

        return id == userPost.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
