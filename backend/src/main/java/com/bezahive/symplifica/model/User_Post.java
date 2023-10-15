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
    private long userid;
    @NonNull
    private long senderId;
    @Nullable
    private String message;
    @NonNull
    private Date createdAt;
    @NonNull
    private Date udatedAt;

    //foreign key
    @ManyToMany
    @JoinTable (name = "user_posts" , joinColumns = @JoinColumn(name = "userid"),
            inverseJoinColumns = @JoinColumn(name ="postid"))
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public User_Post() {
    }

    public User_Post(long id, long userid, long senderId, @Nullable String message, @NonNull Date createdAt, @NonNull Date udatedAt) {
        this.id = id;
        this.userid = userid;
        this.senderId = senderId;
        this.message = message;
        this.createdAt = createdAt;
        this.udatedAt = udatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userID) {
        this.userid = userid;
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
    public Date getUdatedAt() {
        return udatedAt;
    }

    public void setUdatedAt(@NonNull Date udatedAt) {
        this.udatedAt = udatedAt;
    }

    @Override
    public String toString() {
        return "User_Post{" +
                "id=" + id +
                ", userid=" + userid +
                ", senderId=" + senderId +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                ", udatedAt=" + udatedAt +
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
