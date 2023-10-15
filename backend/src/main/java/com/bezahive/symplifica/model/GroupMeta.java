package com.bezahive.symplifica.model;

import jakarta.persistence.*;

@Entity
@Table(name="groupMeta_table")
public class GroupMeta {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long group_id;
    private String key;
    private String content;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "GroupMeta{" +
                "id=" + id +
                ", group_id=" + group_id +
                ", key='" + key + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
