package com.bezahive.symplifica.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name="groupmeta_table")
public class Meta {

    @Id()
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String test;
    private String metaKey;

    //foreign key
    private String groupid;

}
