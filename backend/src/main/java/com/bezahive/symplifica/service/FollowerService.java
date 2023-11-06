package com.bezahive.symplifica.service;

import com.bezahive.symplifica.model.Follower;
import org.springframework.stereotype.Service;

import java.util.List;

// add @Service annotation
@Service
public interface FollowerService {
    // Add the methods that will be used in the controller
    // The controller will call these methods to perform CRUD operations
    // on the database

    // Add an entity
    public Follower addFollower(Follower follower);

    // Get a follower by id
    public Follower getFollowerById(long id);

    // Get all followers
    public List<Follower> getFollowers();

    // Delete a follower
    public void deleteFollower(long id);

    // Update a follower
    public Follower updateFollower(Follower follower);


}

